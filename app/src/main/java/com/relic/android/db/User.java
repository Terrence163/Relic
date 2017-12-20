package com.relic.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 陶士超 on 2017/12/20.
 */

public class User extends DataSupport {
    private String name;
    private String headPortrait;
    private boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
