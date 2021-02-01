package com.softaai.footballmatchbooking.data.api

import com.softaai.footballmatchbooking.data.model.allevents.AllEventsResponse
import com.softaai.footballmatchbooking.data.model.checkout.CheckoutResponse
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetailsResponse
import com.softaai.footballmatchbooking.data.model.purchase.PurchaseResponse
import retrofit2.Response
import javax.inject.Inject

class BookingApiHelperImpl @Inject constructor(private val bookingApiService: FootballMatchBookingApiService) :
    BookingApiHelper {

    override suspend fun getAllEvents(): Response<AllEventsResponse> =
        bookingApiService.getAllEvents()

    override suspend fun getEventDetails(): Response<EventDetailsResponse> =
        bookingApiService.getEventDetails()

    override suspend fun getCheckout(): Response<CheckoutResponse> = bookingApiService.getCheckout()

    override suspend fun getPurchase(): Response<PurchaseResponse> = bookingApiService.getPurchase()

}