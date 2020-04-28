package com.mahmoud.daggertest.network.remote;

import android.content.Context;

import com.google.gson.Gson;
import com.mahmoud.daggertest.network.local.ModelUser;

import java.text.SimpleDateFormat;

import javax.inject.Inject;

public class ApiManager {

    @Inject
    protected ApiInterface apiNetwork;

    @Inject
    protected ModelUser modelUser;

    @Inject
    protected Gson gson;


    @Inject
    SimpleDateFormat dateFormat;

    protected String lang;

    private Context context;

    @Inject
    public ApiManager(Context context) {
//        this.lang = StaticMethods.getLocalLanguage(context);

        this.context = context;
    }


//    public Observable<ModelAuthResponse> requestLogin(ModelAuthRequest modelAuthRequest) {
//        return apiNetwork.requestLogin(
//                modelAuthRequest.getEmail(),
//                modelAuthRequest.getPassword()
////                modelAuthRequest
//        );
//    }


}
