package com.example.mvvmpractice

import android.app.Activity
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    lateinit var mainViewModel: MainViewModel
    private val txtViewFacts: TextView
        get() = findViewById(R.id.txtView)

    private val btnUpdate: Button
        get() = findViewById(R.id.btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.factsLiveData.observe(this, Observer {
            txtViewFacts.text = it
        })


        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()
        }
    }
}