package com.javiersl.projectfinalnextu;

import android.app.Application;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;

/**
 * Created by JavierSL on 20/07/2018.
 */

public class AppController extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        //Para dar funcionamiento
        FacebookSdk.sdkInitialize(this);
        AppEventsLogger.activateApp(this);
    }
}
