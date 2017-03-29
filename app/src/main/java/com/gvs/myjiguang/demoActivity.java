package com.gvs.myjiguang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by gvs on 2017/3/28.
 */

public class demoActivity  extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_dialog);
    }

    // 关闭按钮事件
    public void closHelp(View v) {
        demoActivity.this.finish();
    }

    // 返回键
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) { // 如果是手机上的返回键
            demoActivity.this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}