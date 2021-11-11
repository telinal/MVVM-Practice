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
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    //1. val TAG = "MAIN"
    lateinit var txtCounter: TextView
    lateinit var mainViewModel: MainViewModel
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //1. Example for Observer
//        lifecycle.addObserver(Observer())
//        Log.d("MAIN", "Activity ONCREATE")

    // 2. Example for ViewModel
mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        txtCounter =findViewById(R.id.txtCounter)
        button = findViewById(R.id.increment)
        setText()
        button.setOnClickListener {
            increment()
        }
    }
    private fun setText() {
        txtCounter.text = mainViewModel.count.toString()
    }
    private fun increment() {
        mainViewModel.increment()
        setText()
    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.d("MAIN", "Acivity ONSTART")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("MAIN", "Acivity ONRESUME")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("MAIN", "Acivity ONPAUSE")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.d("MAIN", "Acivity ONSTOP")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("MAIN", "Acivity ONDESTROY")
//    }
}