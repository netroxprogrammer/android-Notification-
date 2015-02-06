package com.example.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity   implements  OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button notification =(Button)findViewById(R.id.notification);
   notification.setOnClickListener(this);
    
    
    
    
    }

    
    public  void  onClick(View v)
    {
    	
    	int  id=v.getId();
    	if(id==R.id.notification){
    	NotificationManager m=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    	Notification notify=new  Notification(android.R.drawable.stat_notify_error,"hello  this notification",System.currentTimeMillis());
    	Context context=MainActivity.this;
    	CharSequence  title="this  is error  mesage";
    	CharSequence  details="please  chek messag e this is details";
    	
    	Intent intent=new Intent(context, MainActivity.class);
    	
    	PendingIntent  pending=PendingIntent.getActivity(context, 0, intent, 0);
    		notify.setLatestEventInfo(context, title, details, pending);
    		
    		m.notify(0, notify);
    		
    	}
    	}
    	
    	
    }

