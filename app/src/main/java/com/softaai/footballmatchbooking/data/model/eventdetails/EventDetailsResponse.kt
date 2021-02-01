package com.softaai.footballmatchbooking.data.model.eventdetails


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EventDetailsResponse(
    @Json(name = "eventDetails")
    val eventDetailsList: List<EventDetail>
)