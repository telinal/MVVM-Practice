package com.example.mvvmpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val txtViewLiveDataObject = MutableLiveData<String>("This is mutable live data using data binding with viewModel")

    val txtViewLiveData: LiveData<String>
    get() = txtViewLiveDataObject

    fun updateLiveData() {
        txtViewLiveDataObject.value = "Updated live data using data binding with viewModel"
    }
    }
