package com.softaai.footballmatchbooking.main.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.softaai.footballmatchbooking.R
import com.softaai.footballmatchbooking.main.viewmodel.AllEventsViewModel
import com.softaai.footballmatchbooking.utils.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val allEventsViewModel : AllEventsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupObserver()
    }

    private fun setupObserver() {
        allEventsViewModel.allEvents.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data?.let { allEvent -> Toast.makeText(this, "" + allEvent, Toast.LENGTH_LONG).show() }
                }
                Status.LOADING -> {
                    Toast.makeText(this, "Loading...Wait", Toast.LENGTH_LONG).show()
                }
                Status.ERROR -> {
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }
}