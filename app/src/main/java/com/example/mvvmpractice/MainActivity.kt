package com.example.mvvmpractice

import android.app.Activity
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    val TAG = "MAIN"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("MAIN", "Activity ONCREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAIN", "Acivity ONSTART")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "Acivity ONRESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "Acivity ONPAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "Acivity ONSTOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "Acivity ONDESTROY")
    }
}