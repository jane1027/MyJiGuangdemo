package com.gvs.myjiguang;


import android.app.Activity;
import android.os.Bundle;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
