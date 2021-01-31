package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEvent
import com.softaai.footballmatchbooking.data.model.checkout.Checkout
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetail
import com.softaai.footballmatchbooking.data.model.purchase.Purchase
import retrofit2.Response

interface BookingApiHelper {

    suspend fun getAllEvents(): Response<List<AllEvent>>

    suspend fun getEventDetails(): Response<List<EventDetail>>

    suspend fun getCheckout(): Response<List<Checkout>>

    suspend fun getPurchase(): Response<List<Purchase>>

}