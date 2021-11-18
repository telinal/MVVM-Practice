package com.example.mvvmpractice

import com.example.mvvmpractice.MainViewModel
import com.example.mvvmpractice.R
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Posts("Angel",
            "https://www.thebalancesmb.com/thmb/PqO5NClEEFvJbqarIEctl9WziXM=/3437x2578/smart/filters:no_upscale()/AngelInvestor-56a8302b3df78cf7729ce41c.jpg"
        )

        binding.post = post
    }
}