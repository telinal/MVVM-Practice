package com.example.mvvmpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val factsLiveDataObject = MutableLiveData<String>("This is mutable live data")

    val factsLiveData: LiveData<String>
    get() = factsLiveDataObject

    fun updateLiveData() {
        factsLiveDataObject.value = "Updated live data"
    }
    }
