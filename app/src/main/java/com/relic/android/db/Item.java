package com.relic.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Terrence on 2017/12/20.
 */

public class Item extends DataSupport {
    private String titleItem;
    private String context;
    private boolean upload;

    public String getTitleItem() {
        return titleItem;
    }

    public void setTitleItem(String titleItem) {
        this.titleItem = titleItem;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }
}
