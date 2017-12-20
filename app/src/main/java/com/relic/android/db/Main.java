package com.relic.android.db;

import org.litepal.crud.DataSupport;

import java.sql.Date;

/**
 * Created by 陶士超 on 2017/12/20.
 */

public class Main extends DataSupport {
    private String title;
    private String context;
    private Date pubData;
    private boolean upload;
    private boolean status;
    private Type mType;
    private User mUser;
    private int rank;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getPubData() {
        return pubData;
    }

    public void setPubData(Date pubData) {
        this.pubData = pubData;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Type getType() {
        return mType;
    }

    public void setType(Type type) {
        mType = type;
    }
}
