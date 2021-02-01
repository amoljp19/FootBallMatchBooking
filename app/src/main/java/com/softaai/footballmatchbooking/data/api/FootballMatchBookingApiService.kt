package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEvent
import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.Checkout
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetail
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.Purchase
import com.softaai.footballmatchbooking.data.model.purchase.PurchaseResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface FootballMatchBookingApiService {

    @GET("allEvents")
    suspend fun getAllEvents(): Response<AllEventsResponse/*List<AllEvent>*/>

//    @GET("allEvents")
//    suspend fun fetchAllEvents(): Call<AllEventsResponse>

    @GET("eventDetails")
    suspend fun getEventDetails(): Response<EventDetailsResponse/*List<EventDetail>*/>

    @GET("checkout")
    suspend fun getCheckout(): Response<CheckoutResponse/*List<Checkout>*/>

    @GET("purchase")
    suspend fun getPurchase(): Response<PurchaseResponse/*List<Purchase>*/>
}