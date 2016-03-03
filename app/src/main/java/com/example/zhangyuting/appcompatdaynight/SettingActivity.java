package com.example.zhangyuting.appcompatdaynight;

import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;

public class SettingActivity extends BaseActivity {


    @Override
    public int getLayoutID() {
        return R.layout.activity_setting;
    }

    @Override
    public void initView() {
        SwitchCompat switchcompat = (SwitchCompat) findViewById(R.id.switchcompat);
        getSupportActionBar().setTitle("设置");

        switchcompat.setChecked(UserInfo.getDayNightTheme(this));
        switchcompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                initTheme(isChecked);
                UserInfo.setDayNightTheme(SettingActivity.this, isChecked);
            }
        });
    }

}
