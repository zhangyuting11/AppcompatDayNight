package com.example.zhangyuting.appcompatdaynight;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by zhangyuting on 2016/3/3.
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (UserInfo.getDayNightTheme(getApplicationContext())){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
