package com.softaai.footballmatchbooking.data.repository

import com.softaai.footballmatchbooking.data.api.BookingApiHelper
import javax.inject.Inject

class PurchaseRepository @Inject constructor(private val bookingApiHelper: BookingApiHelper) {

    suspend fun getPurchase() = bookingApiHelper.getPurchase()

}