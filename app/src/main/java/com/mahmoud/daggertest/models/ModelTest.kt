package com.mahmoud.daggertest.models

import android.content.Context
import android.widget.Toast
import com.mahmoud.daggertest.network.local.ModelUser
import javax.inject.Inject

class  ModelTest @Inject constructor(var context: Context){



    fun callToast(modelUser: ModelUser){
        Toast.makeText(context, modelUser.lang, Toast.LENGTH_LONG).show()
    }


}