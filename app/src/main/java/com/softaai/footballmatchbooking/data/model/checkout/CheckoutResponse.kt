package com.softaai.footballmatchbooking.data.model.checkout


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CheckoutResponse(
    @Json(name = "checkout")
    val checkoutList: List<Checkout>
)