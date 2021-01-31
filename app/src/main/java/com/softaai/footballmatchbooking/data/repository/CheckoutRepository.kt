package com.softaai.footballmatchbooking.data.repository

import com.softaai.footballmatchbooking.data.api.BookingApiHelper

class CheckoutRepository constructor(private val bookingApiHelper: BookingApiHelper) {

    suspend fun getCheckout() = bookingApiHelper.getCheckout()

}