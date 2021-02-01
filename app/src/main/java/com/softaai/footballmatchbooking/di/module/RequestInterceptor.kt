package com.softaai.footballmatchbooking.di.module

import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val request = originalRequest.newBuilder().addHeader("Authorization", "Bearer " + "b0352a7d-5343-463f-8c96-d9abfc0258c8").build()
        return chain.proceed(request)
    }
}