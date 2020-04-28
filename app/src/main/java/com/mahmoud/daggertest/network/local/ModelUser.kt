package com.mahmoud.daggertest.network.local

import android.content.SharedPreferences
import com.mahmoud.daggertest.models.constants.ModelSharedConstants
import javax.inject.Inject

class ModelUser @Inject constructor(var sharedPreferences: SharedPreferences) {
    var lang: String?
    var credentials: String?
    var userId: String?
    var userName: String?
    var userEmail: String?
    var userPassword: String?

    val isLogin: Boolean
        get() {
            credentials = sharedPreferences.getString(ModelSharedConstants.KEY_CREDENTIALS, null)
            return credentials != null
        }

    fun saveData() {
        sharedPreferences.edit()
            .putString(ModelSharedConstants.KEY_LANG, lang)
            .putString(ModelSharedConstants.KEY_CREDENTIALS, credentials)
            .putString(ModelSharedConstants.KEY_ID, userId)
            .putString(ModelSharedConstants.KEY_NAME, userName)
            .putString(ModelSharedConstants.KEY_EMAIL, userEmail)
            .putString(ModelSharedConstants.KEY_PASSWORD, userPassword)
            .apply()
    }

    fun removeData() {
        sharedPreferences.edit()
            .putString(ModelSharedConstants.KEY_CREDENTIALS, null)
            .putString(ModelSharedConstants.KEY_ID, null)
            .putString(ModelSharedConstants.KEY_NAME, null)
            .putString(ModelSharedConstants.KEY_EMAIL, null)
            .putString(ModelSharedConstants.KEY_PASSWORD, null)
            .apply()
    }

    init {
        lang = sharedPreferences.getString(ModelSharedConstants.KEY_LANG, "en")
        credentials = sharedPreferences.getString(ModelSharedConstants.KEY_CREDENTIALS, null)
        userName = sharedPreferences.getString(ModelSharedConstants.KEY_NAME, null)
        userId = sharedPreferences.getString(ModelSharedConstants.KEY_ID, null)
        userEmail = sharedPreferences.getString(ModelSharedConstants.KEY_EMAIL, null)
        userPassword = sharedPreferences.getString(ModelSharedConstants.KEY_PASSWORD, null)
    }
}