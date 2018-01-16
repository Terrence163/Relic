package com.relic.android.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.relic.android.util.ActivityCollector;
import com.relic.android.util.LogUtil;

/**
 * Created by Terrence on 2017/12/18.
 */

public class BaseActivity extends AppCompatActivity  {
    private static final String TAG = "BaseActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.d(TAG,"onCreate:"+ getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.d(TAG, "onDestroy: "+getClass().getSimpleName());
        ActivityCollector.removeActivity(this);
    }
}
