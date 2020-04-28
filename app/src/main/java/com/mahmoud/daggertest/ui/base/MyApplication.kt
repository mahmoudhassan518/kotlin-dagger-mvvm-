package com.mahmoud.daggertest.ui.base

import android.app.Application
import com.mahmoud.daggertest.di.components.AppComponent
import com.mahmoud.daggertest.di.components.DaggerAppComponent
import com.mahmoud.daggertest.di.modules.base.AppModule

class MyApplication : Application() {

    lateinit var appComponent: AppComponent

    private fun initDagger(app: MyApplication): AppComponent =
        DaggerAppComponent.builder()
            .appModule(AppModule(app))
            .build()


    override fun onCreate() {
        super.onCreate()

        appComponent = initDagger(this)

    }
}