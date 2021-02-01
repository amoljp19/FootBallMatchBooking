package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.PurchaseResponse
import retrofit2.Response

interface BookingApiHelper {

    suspend fun getAllEvents(): Response<AllEventsResponse>

    suspend fun getEventDetails(): Response<EventDetailsResponse>

    suspend fun getCheckout(): Response<CheckoutResponse>

    suspend fun getPurchase(): Response<PurchaseResponse>

}