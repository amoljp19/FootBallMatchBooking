package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.PurchaseResponse
import retrofit2.http.GET

interface FootballMatchBookingApiService {

    @GET("allEvents")
    suspend fun getAllEvents(): AllEventsResponse

    @GET("eventDetails")
    suspend fun getEventDetails(): EventDetailsResponse

    @GET("checkout")
    suspend fun getCheckout(): CheckoutResponse

    @GET("purchase")
    suspend fun getPurchase(): PurchaseResponse
}