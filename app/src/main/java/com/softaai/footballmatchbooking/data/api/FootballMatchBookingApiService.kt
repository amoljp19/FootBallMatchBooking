package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.PurchaseResponse
import retrofit2.Response
import retrofit2.http.GET

interface FootballMatchBookingApiService {

    @GET("allEvents")
    suspend fun getAllEvents(): Response<AllEventsResponse>

    @GET("eventDetails")
    suspend fun getEventDetails(): Response<EventDetailsResponse>

    @GET("checkout")
    suspend fun getCheckout(): Response<CheckoutResponse>

    @GET("purchase")
    suspend fun getPurchase(): Response<PurchaseResponse>
}