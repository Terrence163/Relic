package com.relic.android.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制所有的Activity
 * Created by 陶士超 on 2017/12/18.
 */

public class ActivityCollector {
    public static List<Activity> sActivities = new ArrayList<>();
//添加所给的Activity
    public static void addActivity(Activity activity){
        sActivities.add(activity);
    }
//移除指定的Activity
    public static void removeActivity(Activity activity) {
        sActivities.add(activity);
    }
//终止所有Activity
    public static void finishAll(){
        for(Activity activity : sActivities) {
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
