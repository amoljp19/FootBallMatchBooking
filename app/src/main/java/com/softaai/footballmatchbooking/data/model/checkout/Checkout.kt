package com.softaai.footballmatchbooking.data.model.checkout


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Checkout(
    @Json(name = "dateTime")
    val dateTime: String,
    @Json(name = "gameLength")
    val gameLength: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "isPrivate")
    val isPrivate: Boolean,
    @Json(name = "location")
    val location: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "paymentMethodUnsupported")
    val paymentMethodUnsupported: String,
    @Json(name = "price")
    val price: Int
)