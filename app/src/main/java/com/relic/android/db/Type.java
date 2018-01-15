package com.relic.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Terrence on 2017/12/20.
 */

public class Type extends DataSupport {
    private Main mMain;
    private String name;

    public Main getMain() {
        return mMain;
    }

    public void setMain(Main main) {
        mMain = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
