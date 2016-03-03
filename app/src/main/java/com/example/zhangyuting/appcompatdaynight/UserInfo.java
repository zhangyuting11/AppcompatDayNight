package com.example.zhangyuting.appcompatdaynight;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by zhangyuting on 2016/3/3.
 */
public class UserInfo {
    public static String DAY_NIGHT_THEME ="DAY_NIGHT_THEME";

    public static void setDayNightTheme(Context context,boolean isNight){
        SharedPreferences sp = context.getSharedPreferences(DAY_NIGHT_THEME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();
        editor.putBoolean(DAY_NIGHT_THEME,isNight);
        editor.commit();
    }
    public static boolean getDayNightTheme(Context context){
        SharedPreferences sp = context.getSharedPreferences(DAY_NIGHT_THEME, Context.MODE_PRIVATE);
        return sp.getBoolean(DAY_NIGHT_THEME,false);
    }
}
