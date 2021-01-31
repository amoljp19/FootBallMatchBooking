package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.PurchaseResponse
import retrofit2.http.GET

interface BookingApiHelper {

    suspend fun getAllEvents(): AllEventsResponse

    suspend fun getEventDetails(): EventDetailsResponse

    suspend fun getCheckout(): CheckoutResponse

    suspend fun getPurchase(): PurchaseResponse

}