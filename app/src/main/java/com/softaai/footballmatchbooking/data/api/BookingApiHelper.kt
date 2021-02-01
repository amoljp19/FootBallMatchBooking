package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEvent
import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.Checkout
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetail
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.Purchase
import com.softaai.footballmatchbooking.data.model.purchase.PurchaseResponse
import retrofit2.Response

interface BookingApiHelper {

    suspend fun getAllEvents(): Response<AllEventsResponse/*List<AllEvent>*/>

    suspend fun getEventDetails(): Response<EventDetailsResponse/*List<EventDetail>*/>

    suspend fun getCheckout(): Response<CheckoutResponse/*List<Checkout>*/>

    suspend fun getPurchase(): Response<PurchaseResponse/*List<Purchase>*/>

}