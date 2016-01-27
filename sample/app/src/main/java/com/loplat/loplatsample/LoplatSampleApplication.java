package com.loplat.loplatsample;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Application;
import android.content.Context;
import android.util.Patterns;

import com.loplat.placeengine.Plengi;
import com.loplat.placeengine.utils.LoplatLogger;

import java.util.regex.Pattern;



public class LoplatSampleApplication extends Application {

    Plengi mPlengi = null;

    private static LoplatSampleApplication instance;

    public static Context getContext(){
        return instance;
        // or return instance.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();
        LoplatLogger.writeLog("LoplatApplication created ---------------");

        instance = this;

        // set up loplat engine
        mPlengi = Plengi.getInstance(this);
        mPlengi.setListener(new LoplatPlengiListener());
    }


}
