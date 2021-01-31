package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.PurchaseResponse

class BookingApiHelperImpl constructor (private val bookingApiService: FootballMatchBookingApiService) : BookingApiHelper {

    override suspend fun getAllEvents(): AllEventsResponse = bookingApiService.getAllEvents()

    override suspend fun getEventDetails(): EventDetailsResponse = bookingApiService.getEventDetails()

    override suspend fun getCheckout(): CheckoutResponse = bookingApiService.getCheckout()

    override suspend fun getPurchase(): PurchaseResponse = bookingApiService.getPurchase()

}