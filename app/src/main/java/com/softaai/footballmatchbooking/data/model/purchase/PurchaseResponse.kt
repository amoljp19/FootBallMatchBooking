package com.softaai.footballmatchbooking.data.model.purchase


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PurchaseResponse(
    @Json(name = "purchase")
    val purchaseList: List<Purchase>
)