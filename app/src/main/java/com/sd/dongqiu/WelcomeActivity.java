package com.sd.dongqiu;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class WelcomeActivity extends myActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //更新配置文件、检查用户是否登录....
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(100);
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                WelcomeActivity.this.finish();
            }
        }).start();
    }
}
