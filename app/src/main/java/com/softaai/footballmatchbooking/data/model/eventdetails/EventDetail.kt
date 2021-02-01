package com.softaai.footballmatchbooking.data.model.eventdetails


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EventDetail(
    @Json(name = "bookBy")
    val bookBy: String,
    @Json(name = "dateTime")
    val dateTime: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "eventCreator")
    val eventCreator: String,
    @Json(name = "friendsAttending")
    val friendsAttending: Int,
    @Json(name = "id")
    val id: Int,
    @Json(name = "isPartnered")
    val isPartnered: Boolean,
    @Json(name = "location")
    val location: String,
    @Json(name = "maxTickets")
    val maxTickets: Int,
    @Json(name = "name")
    val name: String,
    @Json(name = "price")
    val price: Float,
    @Json(name = "sport")
    val sport: String,
    @Json(name = "tags")
    val tags: String,
    @Json(name = "teamInformation")
    val teamInformation: String,
    @Json(name = "ticketsSold")
    val ticketsSold: Int,
    @Json(name = "totalPrize")
    val totalPrize: Float,
    @Json(name = "venueInformation")
    val venueInformation: String
)