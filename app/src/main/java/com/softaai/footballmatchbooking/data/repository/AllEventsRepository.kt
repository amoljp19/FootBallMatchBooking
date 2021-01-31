package com.softaai.footballmatchbooking.data.repository

import com.softaai.footballmatchbooking.data.api.BookingApiHelper
import javax.inject.Inject

class AllEventsRepository @Inject constructor(private val bookingApiHelper: BookingApiHelper) {

    suspend fun getAllEvents() = bookingApiHelper.getAllEvents()

}