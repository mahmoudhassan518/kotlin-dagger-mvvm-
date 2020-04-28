package com.mahmoud.daggertest.network.local;

import android.content.SharedPreferences;

import com.mahmoud.daggertest.models.constants.ModelSharedConstants;

import javax.inject.Inject;

public class ModelUser {
    private SharedPreferences sharedPreferences;
    private String lang;


    private String credentials;
    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private boolean serviceStatus;
    private boolean deviceReadonly;
    private boolean readonly;


    private int usersLimit;
    private int devicesLimit;


    @Inject
    public ModelUser(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;


        serviceStatus = sharedPreferences.getBoolean(ModelSharedConstants.KEY_service_Status, false);
        deviceReadonly = sharedPreferences.getBoolean(ModelSharedConstants.KEY_DEVICE_READ_ONLY, true);
        readonly = sharedPreferences.getBoolean(ModelSharedConstants.KEY_READ_ONLY, true);

        lang = sharedPreferences.getString(ModelSharedConstants.KEY_LANG, "en");

        credentials = sharedPreferences.getString(ModelSharedConstants.KEY_CREDENTIALS, null);
        userName = sharedPreferences.getString(ModelSharedConstants.KEY_NAME, null);
        userId = sharedPreferences.getString(ModelSharedConstants.KEY_ID, null);
        userEmail = sharedPreferences.getString(ModelSharedConstants.KEY_EMAIL, null);
        userPassword = sharedPreferences.getString(ModelSharedConstants.KEY_PASSWORD, null);

        usersLimit = sharedPreferences.getInt(ModelSharedConstants.KEY_USERS_LIMIT, 0);
        devicesLimit = sharedPreferences.getInt(ModelSharedConstants.KEY_DEVICES_LIMIT, 0);


    }


    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public void setSharedPreferences(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public boolean isServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(boolean serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public int getUsersLimit() {
        return usersLimit;
    }

    public void setUsersLimit(int usersLimit) {
        this.usersLimit = usersLimit;
    }

    public int getDevicesLimit() {
        return devicesLimit;
    }

    public void setDevicesLimit(int devicesLimit) {
        this.devicesLimit = devicesLimit;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isDeviceReadonly() {
        return deviceReadonly;
    }

    public void setDeviceReadonly(boolean deviceReadonly) {
        this.deviceReadonly = deviceReadonly;
    }

    public boolean isReadonly() {
        return readonly;
    }

    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

    public boolean isLogin() {
        credentials = sharedPreferences.getString(ModelSharedConstants.KEY_CREDENTIALS, null);
        return credentials != null;
    }


    public void saveData() {
        sharedPreferences.edit()
                .putString(ModelSharedConstants.KEY_LANG, lang)
                .putBoolean(ModelSharedConstants.KEY_service_Status, serviceStatus)
                .putBoolean(ModelSharedConstants.KEY_READ_ONLY, readonly)
                .putBoolean(ModelSharedConstants.KEY_DEVICE_READ_ONLY, deviceReadonly)

                .putString(ModelSharedConstants.KEY_CREDENTIALS, credentials)
                .putString(ModelSharedConstants.KEY_ID, userId)
                .putString(ModelSharedConstants.KEY_NAME, userName)
                .putString(ModelSharedConstants.KEY_EMAIL, userEmail)
                .putString(ModelSharedConstants.KEY_PASSWORD, userPassword)
                .putInt(ModelSharedConstants.KEY_USERS_LIMIT, usersLimit)
                .putInt(ModelSharedConstants.KEY_DEVICES_LIMIT, devicesLimit)

                .apply();


    }

    public void removeData() {
        sharedPreferences.edit()
                .putString(ModelSharedConstants.KEY_CREDENTIALS, null)
                .putString(ModelSharedConstants.KEY_ID, null)
                .putString(ModelSharedConstants.KEY_NAME, null)
                .putString(ModelSharedConstants.KEY_EMAIL, null)
                .putString(ModelSharedConstants.KEY_PASSWORD, null)
                .putInt(ModelSharedConstants.KEY_USERS_LIMIT, 0)
                .putInt(ModelSharedConstants.KEY_DEVICES_LIMIT, 0)
                .putBoolean(ModelSharedConstants.KEY_READ_ONLY, true)
                .putBoolean(ModelSharedConstants.KEY_DEVICE_READ_ONLY, true)


                .apply();

    }


}
