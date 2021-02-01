package com.softaai.footballmatchbooking.data.model.allevents
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AllEventsResponse(
    @Json(name = "allEvents")
    val allEventsList: List<AllEvent>
)