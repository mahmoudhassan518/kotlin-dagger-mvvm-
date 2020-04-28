package com.mahmoud.daggertest.ui.sub

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.mahmoud.daggertest.R
import com.mahmoud.daggertest.di.components.AppComponent
import com.mahmoud.daggertest.models.ModelTest
import com.mahmoud.daggertest.ui.base.BaseActivity
import com.mahmoud.daggertest.viewmodels.MainViewModel
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var modelTest: ModelTest

    @Inject
    lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.booleanMutableLiveData.observe(this, Observer { value -> onResponse(value) })

    }

    private fun onResponse(response: Boolean) {
        Toast.makeText(this, "is equal: $response", Toast.LENGTH_LONG).show()
    }

    override fun injectActivity(component: AppComponent) {
        component.inject(this)
    }

    override fun onResume() {
        super.onResume()

        modelTest.numberOne = 1
        modelTest.numberTwo = 2


        viewModel.isEqual(modelTest)

    }
}
