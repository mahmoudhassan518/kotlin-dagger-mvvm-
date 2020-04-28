package com.mahmoud.daggertest.di.modules.base

import androidx.lifecycle.MutableLiveData
import com.mahmoud.daggertest.models.custom.ModelThrowable
import dagger.Module
import dagger.Provides

@Module
class LiveDataModule {
    @Provides
    fun booleanMutableLiveData(): MutableLiveData<Boolean> {
        return MutableLiveData()
    }

    @Provides
    fun mutableLiveData(): MutableLiveData<*> {
        return MutableLiveData<Any>()
    }

    @Provides
    fun stringMutableLiveData(): MutableLiveData<String> {
        return MutableLiveData()
    }

    @Provides
    fun longMutableLiveData(): MutableLiveData<Long> {
        return MutableLiveData()
    }

    @Provides
    fun modelThrowableMutableLiveData(): MutableLiveData<ModelThrowable> {
        return MutableLiveData()
    }
}