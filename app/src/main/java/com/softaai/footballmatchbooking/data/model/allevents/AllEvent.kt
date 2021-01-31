package com.softaai.footballmatchbooking.data.model.allevents
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AllEvent(
    @Json(name = "bookBy")
    val bookBy: String,
    @Json(name = "dateTime")
    val dateTime: String,
    @Json(name = "friendsAttending")
    val friendsAttending: Int,
    @Json(name = "id")
    val id: Int,
    @Json(name = "isPartnered")
    val isPartnered: Boolean,
    @Json(name = "isRecommended")
    val isRecommended: Boolean,
    @Json(name = "location")
    val location: String,
    @Json(name = "maxTickets")
    val maxTickets: Int,
    @Json(name = "name")
    val name: String,
    @Json(name = "price")
    val price: Int,
    @Json(name = "sport")
    val sport: String,
    @Json(name = "ticketsSold")
    val ticketsSold: Int,
    @Json(name = "totalPrize")
    val totalPrize: Int
)