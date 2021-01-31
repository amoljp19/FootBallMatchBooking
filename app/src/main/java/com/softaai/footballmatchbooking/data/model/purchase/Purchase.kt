package com.softaai.footballmatchbooking.data.model.purchase


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Purchase(
    @Json(name = "dateTime")
    val dateTime: String,
    @Json(name = "eventId")
    val eventId: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "paymentMethodType")
    val paymentMethodType: String,
    @Json(name = "purchaseAmount")
    val purchaseAmount: String
)