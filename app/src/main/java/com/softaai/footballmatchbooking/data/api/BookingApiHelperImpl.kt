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
import javax.inject.Inject

class BookingApiHelperImpl @Inject constructor (private val bookingApiService: FootballMatchBookingApiService) : BookingApiHelper {

    override suspend fun getAllEvents(): Response<AllEventsResponse/*List<AllEvent>*/> = bookingApiService.getAllEvents()

    override suspend fun getEventDetails(): Response<EventDetailsResponse/*List<EventDetail>*/> = bookingApiService.getEventDetails()

    override suspend fun getCheckout(): Response<CheckoutResponse/*List<Checkout>*/> = bookingApiService.getCheckout()

    override suspend fun getPurchase(): Response<PurchaseResponse/*List<Purchase>*/> = bookingApiService.getPurchase()

//    fun fetchApiFeedResponse(onResult: (response: ApiResponse<ApiFeedResponse>) -> Unit) {
//        this.iTunesService.fetchApiFeedResponse().transform(onResult)
//    }

}