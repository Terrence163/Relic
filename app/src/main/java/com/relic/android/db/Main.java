package com.relic.android.db;

import org.litepal.crud.DataSupport;




/**
 * Created by Terrence on 2017/12/20.
 */

public class Main extends DataSupport {
    private String title;
    private String context;
    private String pubDateTime;
    private boolean upload;
    private boolean status;
    private Item mItem;
    private int type_id;

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    //    等级
    private int rank;

    public Item getItem() {
        return mItem;
    }

    public void setItem(Item item) {
        mItem = item;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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

    public String getPubDateTime() {
        return pubDateTime;
    }

    public void setPubDateTime(String pubDateTime) {
        this.pubDateTime = pubDateTime;
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

}
