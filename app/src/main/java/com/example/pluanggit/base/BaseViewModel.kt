package com.example.pluanggit.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pluanggit.R
import com.example.pluanggit.Util.NetworkHelper
import com.example.pluanggit.Util.Resource
import org.koin.core.KoinComponent
import org.koin.core.inject

abstract class BaseViewModel : ViewModel() , KoinComponent{

    private val networkHelper : NetworkHelper by inject()
    val messageStringId: MutableLiveData<Resource<Int>> = MutableLiveData()


    protected fun checkInternetConnection(): Boolean =
        if (networkHelper.isNetworkConnected()) true
        else {
            messageStringId.postValue(Resource.error(R.string.network_connection_error))
            false
        }

}