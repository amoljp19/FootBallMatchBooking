package com.softaai.footballmatchbooking.di.module

import com.softaai.footballmatchbooking.data.api.BookingApiHelper
import com.softaai.footballmatchbooking.data.api.BookingApiHelperImpl
import com.softaai.footballmatchbooking.data.api.FootballMatchBookingApiService
import com.softaai.footballmatchbooking.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {

    @Provides
    fun provideBaseUrl() = Constants.BASE_URL

    @Provides
    @Singleton
    fun provideOkHttpClient() =  OkHttpClient.Builder().build()


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, BASE_URL: String): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) = retrofit.create(FootballMatchBookingApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(bookingApiHelper: BookingApiHelperImpl): BookingApiHelper = bookingApiHelper

}