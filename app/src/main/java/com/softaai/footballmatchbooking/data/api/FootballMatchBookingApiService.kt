package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEvent
import com.softaai.footballmatchbooking.data.model.checkout.Checkout
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetail
import com.softaai.footballmatchbooking.data.model.purchase.Purchase
import retrofit2.Response
import retrofit2.http.GET

interface FootballMatchBookingApiService {

    @GET("allEvents")
    suspend fun getAllEvents(): Response<List<AllEvent>>

    @GET("eventDetails")
    suspend fun getEventDetails(): Response<List<EventDetail>>

    @GET("checkout")
    suspend fun getCheckout(): Response<List<Checkout>>

    @GET("purchase")
    suspend fun getPurchase(): Response<List<Purchase>>
}