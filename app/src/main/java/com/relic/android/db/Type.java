package com.relic.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 陶士超 on 2017/12/20.
 */

public class Type extends DataSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
