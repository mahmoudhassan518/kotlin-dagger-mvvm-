package com.mahmoud.daggertest.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import com.mahmoud.daggertest.network.remote.ApiManager
import javax.inject.Inject

open class BaseViewModel @Inject constructor() : ViewModel() {
    @Inject
    lateinit var apiManager: ApiManager

    @Inject
    lateinit var context: Context


}