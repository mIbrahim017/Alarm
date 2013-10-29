package com.example.alarm;
/*
 * http://learnandroideasily.blogspot.com/2013/06/scheduling-task-using-alarm-manager.html
 * android alarm example
 * http://www.techrepublic.com/blog/software-engineer/use-androids-alarmmanager-to-schedule-an-event/
 * 
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.Toast;

public class AlarmReciever  extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
	
		 String phoneNumberReciver="9718202185";// phone number to which SMS to be send
		 String message="Hi I will be there later, See You soon";// message to send
		 //SmsManager sms = SmsManager.getDefault();
		 //sms.sendTextMessage(phoneNumberReciver, null, message, null, null);
		 Toast.makeText(context, "Alarm Triggered and SMS Sent", Toast.LENGTH_LONG).show();
		 Log.i("app",  "Received Broad cast");
		 
		 Intent newIntent = new Intent(context , AlarmDetails.class);
		 newIntent.setFlags( Intent. FLAG_ACTIVITY_NEW_TASK); 
		 context.startActivity(newIntent);
		
	}
	 
}
