package com.softaai.footballmatchbooking.data.repository

import com.softaai.footballmatchbooking.data.api.BookingApiHelper

class AllEventsRepository constructor(private val bookingApiHelper: BookingApiHelper) {

    suspend fun getAllEvents() = bookingApiHelper.getAllEvents()

}