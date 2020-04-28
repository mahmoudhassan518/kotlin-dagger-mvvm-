package com.mahmoud.daggertest.viewmodels

import androidx.lifecycle.MutableLiveData
import com.mahmoud.daggertest.models.ModelTest
import javax.inject.Inject

class MainViewModel  //
//    @Inject
//    MutableLiveData<ModelDevicesResponse> modelDevicesResponseMutableLiveData;
@Inject constructor() : BaseViewModel() {
    @Inject
    lateinit var booleanMutableLiveData: MutableLiveData<Boolean>
    fun isEqual(modelTest: ModelTest) {
        booleanMutableLiveData.value = modelTest.numberOne == modelTest.numberTwo
    }

}