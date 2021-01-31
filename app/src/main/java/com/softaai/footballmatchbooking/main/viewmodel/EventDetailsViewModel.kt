package com.softaai.footballmatchbooking.main.viewmodel

import androidx.lifecycle.ViewModel
import com.softaai.footballmatchbooking.data.repository.EventDetailsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EventDetailsViewModel @Inject constructor(
    private val eventDetailsRepository: EventDetailsRepository
) : ViewModel() {

}