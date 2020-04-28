package com.mahmoud.daggertest.ui.sub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mahmoud.daggertest.ui.base.MyApplication
import com.mahmoud.daggertest.R
import com.mahmoud.daggertest.di.components.AppComponent
import com.mahmoud.daggertest.models.ModelTest
import com.mahmoud.daggertest.network.local.ModelUser
import com.mahmoud.daggertest.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var modelTest: ModelTest


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApplication).appComponent.inject(this)
    }

    override fun injectActivity(component: AppComponent) {
        component.inject(this)
    }

    override fun onResume() {
        super.onResume()

        modelTest.callToast(modelUser)
    }
}
