package com.relic.android.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * 继承Application类
 * Created by Terrence on 2017/12/18.
 */

public class MyApplication extends Application{
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
//       对LitePal开源数据库初始化
        LitePal.initialize(sContext);
    }

    public static Context getContext() {
        return sContext;
    }
}
