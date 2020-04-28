package com.mahmoud.daggertest.di.modules.base

import android.content.Context
import android.content.SharedPreferences
import android.telephony.TelephonyManager
import com.google.firebase.iid.FirebaseInstanceId
import com.mahmoud.daggertest.models.constants.ModelSharedConstants
import dagger.Module
import dagger.Provides
import timber.log.Timber.DebugTree
import javax.inject.Singleton

@Module
//@Module
class SystemServiceModule {
    //relate with ApplicationComponent
    @Provides
    @Singleton
    fun telephonyManager(context: Context): TelephonyManager {
        return context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
    }

    @Provides
    @Singleton
    fun firebaseInstanceId(): FirebaseInstanceId {
        return FirebaseInstanceId.getInstance()
    }

//    @Provides
//    @Singleton
//    fun provideFragmentManager(baseActivity: BaseActivity): FragmentManager {
//        return baseActivity.supportFragmentManager
//    }

    @Provides
    @Singleton
    fun sharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(
            ModelSharedConstants.sharedName,
            Context.MODE_PRIVATE
        )
    }

    @Provides
    @Singleton
    fun debugTree(): DebugTree {
        return DebugTree()
    }
}