package com.beestar.ble.ble;

import android.app.Application;
import android.content.Context;

import com.beestar.ble.ble.greendao.DaoManager;

/**
 * Created by guzhen on 2017/4/11.
 */
public class MyAPP extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        DaoManager.getInstance();
    }

    public static Context getContext() {
        return mContext;
    }
}
