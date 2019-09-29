package com.haiyunshan.pudding;

import android.app.Application;

public class PuddingApp extends Application {

    private static PuddingApp sInstance;

    public static final PuddingApp instance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = this;
    }

}
