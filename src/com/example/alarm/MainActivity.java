package com.example.alarm;

import java.util.GregorianCalendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class MainActivity extends Activity {

    final static private long ONE_SECOND = 1000;
    final static private long TWENTY_SECONDS = ONE_SECOND * 20;
    final static private long SIXTEEN_SECONDS = ONE_SECOND * 60 ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	
	
	
	public void scheduleAlarm(View v)
	{
		
		// Long time = new GregorianCalendar().getTimeInMillis()+24*60*60*1000;
		
		Log.i("app","time : " +SystemClock.elapsedRealtime() );
		Long time =  SystemClock.elapsedRealtime()  +  SIXTEEN_SECONDS  ;// 60*1000 ;
		 
		Log.i("app","time : " + time);

         Intent intentAlarm = new Intent(this, AlarmReciever.class);
         AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
         
         // set alarm after specific time 
         
      //  alarmManager.set(AlarmManager.RTC_WAKEUP, time, PendingIntent.getBroadcast(this,1, intentAlarm, PendingIntent.FLAG_UPDATE_CURRENT));
         alarmManager.set( AlarmManager.ELAPSED_REALTIME_WAKEUP, time, PendingIntent.getBroadcast(this,1, intentAlarm, 0) );
         Toast.makeText(this, "Alarm Scheduled for Tommrrow", Toast.LENGTH_LONG).show();
		 
	}
}
