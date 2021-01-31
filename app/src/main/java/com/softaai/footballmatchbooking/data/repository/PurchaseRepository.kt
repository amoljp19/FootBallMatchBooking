package com.softaai.footballmatchbooking.data.repository

import com.softaai.footballmatchbooking.data.api.BookingApiHelper

class PurchaseRepository constructor(private val bookingApiHelper: BookingApiHelper) {

    suspend fun getPurchase() = bookingApiHelper.getPurchase()

}