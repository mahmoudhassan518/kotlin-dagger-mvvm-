package com.mahmoud.daggertest.di.modules.sub

import android.content.Context
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import java.io.File
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun cacheFile(context: Context): File { // Context is external decadence
        return File(context.cacheDir, "okHttp_cache")
    }

    @Provides
    @Singleton
    fun cache(file: File?): Cache {
        return Cache(file!!, 10 * 1000 * 1000) //10MB cahe
    }

    @Provides
    @Singleton
    fun okHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor?,
        cache: Cache?
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor!!)
            .cache(cache)
            .build()
    }

    //this not used yet method
    @Provides
    @Singleton
    fun loggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor =
            HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
                override fun log(message: String) {
                    Timber.i(message)
                }
            })
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return httpLoggingInterceptor
    }
}