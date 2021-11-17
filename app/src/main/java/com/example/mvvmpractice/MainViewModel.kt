package com.example.mvvmpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val txtViewLiveDataObject = MutableLiveData<String>("This is mutable live data using data binding")

    val txtViewLiveData: LiveData<String>
    get() = txtViewLiveDataObject

    fun updateLiveData() {
        txtViewLiveDataObject.value = "Updated live data using data binding"
    }
    }
