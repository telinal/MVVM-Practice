package com.example.mvvmpractice

import android.app.Activity
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpractice.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        val quoteObj = Quote("data binding second method")
        binding.quote = quoteObj

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.txtViewLiveData.observe(this, Observer {
            binding.txtView.text = it
        })

        binding.btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()
        }


    }
}