package com.mahmoud.daggertest.network;

import android.app.Activity;

import javax.inject.Inject;

public class Repository {


    private Activity activity;

    @Inject
    public Repository(Activity activity) {
        this.activity = activity;
    }


}
