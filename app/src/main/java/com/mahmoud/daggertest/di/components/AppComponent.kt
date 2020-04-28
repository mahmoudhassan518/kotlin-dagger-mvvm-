package com.mahmoud.daggertest.di.components

import com.mahmoud.daggertest.di.modules.base.ApiInterFaceModule
import com.mahmoud.daggertest.di.modules.base.AppModule
import com.mahmoud.daggertest.di.modules.base.LiveDataModule
import com.mahmoud.daggertest.di.modules.base.SystemServiceModule
import com.mahmoud.daggertest.ui.sub.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, LiveDataModule::class, ApiInterFaceModule::class, SystemServiceModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}