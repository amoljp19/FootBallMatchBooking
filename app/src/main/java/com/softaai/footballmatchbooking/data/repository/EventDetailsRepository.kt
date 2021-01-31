package com.softaai.footballmatchbooking.data.repository

import com.softaai.footballmatchbooking.data.api.BookingApiHelper

class EventDetailsRepository constructor(private val bookingApiHelper: BookingApiHelper) {

    suspend fun getEventDetails() = bookingApiHelper.getEventDetails()

}