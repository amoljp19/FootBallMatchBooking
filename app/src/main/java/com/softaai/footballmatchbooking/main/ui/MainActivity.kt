package com.softaai.footballmatchbooking.main.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.softaai.footballmatchbooking.R
import com.softaai.footballmatchbooking.main.viewmodel.AllEventsViewModel
import com.softaai.footballmatchbooking.main.viewmodel.CheckoutViewModel
import com.softaai.footballmatchbooking.main.viewmodel.EventDetailsViewModel
import com.softaai.footballmatchbooking.main.viewmodel.PurchaseViewModel
import com.softaai.footballmatchbooking.utils.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val allEventsViewModel : AllEventsViewModel by viewModels()
    private val eventDetailsViewModel : EventDetailsViewModel by viewModels()
    private val checkoutViewModel : CheckoutViewModel by viewModels()
    private val purchaseViewModel : PurchaseViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAllEventObserver()
        //setupEventDetailsObserver()
        //setupCheckoutObserver()
        //setupPurchaseObserver()
    }

    private fun setupAllEventObserver() {
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

    private fun setupEventDetailsObserver() {
        eventDetailsViewModel.eventDetails.observe(this, Observer {
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

    private fun setupCheckoutObserver() {
        checkoutViewModel.checkout.observe(this, Observer {
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

    private fun setupPurchaseObserver() {
        purchaseViewModel.purchase.observe(this, Observer {
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