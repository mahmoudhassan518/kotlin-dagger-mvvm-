package com.mahmoud.daggertest.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mahmoud.daggertest.di.components.AppComponent
import com.mahmoud.daggertest.network.local.ModelUser
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var modelUser: ModelUser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val component = (application as MyApplication).appComponent
        injectActivity(component)
    }

    abstract fun injectActivity(component: AppComponent)


}
