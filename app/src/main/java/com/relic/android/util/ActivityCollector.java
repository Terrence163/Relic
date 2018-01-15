package com.relic.android.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制所有的Activity
 * Created by Terrence on 2017/12/18.
 */

public class ActivityCollector {
    public static List<Activity> sActivities = new ArrayList<>();

    /**
     * 添加Activity的子类指定的实例到静态变量sActivities中
     * @param activity
     */
    public static void addActivity(Activity activity){
        sActivities.add(activity);
    }

    /**
     * 从静态变量sActivities中移除Activity的子类指定的实例
     * @param activity
     */
    public static void removeActivity(Activity activity) {
        sActivities.add(activity);
    }

    /**
     * 从静态变量sActivities删除所有的Activity的
     */
    public static void finishAll(){
        for(Activity activity : sActivities) {
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
