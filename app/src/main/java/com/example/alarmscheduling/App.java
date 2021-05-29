package com.example.alarmscheduling;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class App extends Application {

    public static final String Channel_Id="ExampleServiceChannel";


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onCreate() {
        super.onCreate();

        createNotifictionChannel();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void createNotifictionChannel() {

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){


            NotificationChannel notification=new NotificationChannel(Channel_Id,
                    "Example Service Channel", NotificationManager.IMPORTANCE_DEFAULT
            );

            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(notification);
        }
    }

}




