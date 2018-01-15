package com.relic.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Terrence on 2017/12/20.
 */

public class User extends DataSupport {
    private String name;
//  头像
    private String headPortrait;
    private boolean status;
    private Main mMain;
    private Login mLogin;
    public Main getMain() {
        return mMain;
    }

    public void setMain(Main main) {
        mMain = main;
    }

    public Login getLogin() {
        return mLogin;
    }

    public void setLogin(Login login) {
        mLogin = login;
    }

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
