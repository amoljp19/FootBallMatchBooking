package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEvent
import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.Checkout
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetail
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.Purchase
import retrofit2.Response
import javax.inject.Inject

class BookingApiHelperImpl @Inject constructor (private val bookingApiService: FootballMatchBookingApiService) : BookingApiHelper {

    override suspend fun getAllEvents(): Response<List<AllEvent>> = bookingApiService.getAllEvents()

    override suspend fun getEventDetails(): Response<List<EventDetail>> = bookingApiService.getEventDetails()

    override suspend fun getCheckout(): Response<List<Checkout>> = bookingApiService.getCheckout()

    override suspend fun getPurchase(): Response<List<Purchase>> = bookingApiService.getPurchase()

}