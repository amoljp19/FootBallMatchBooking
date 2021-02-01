package com.softaai.footballmatchbooking.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.softaai.footballmatchbooking.data.model.allevents.AllEvent
import com.softaai.footballmatchbooking.data.model.eventdetails.EventDetail
import com.softaai.footballmatchbooking.data.repository.EventDetailsRepository
import com.softaai.footballmatchbooking.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventDetailsViewModel @Inject constructor(
    private val eventDetailsRepository: EventDetailsRepository
) : ViewModel() {

    private val _eventDetails = MutableLiveData<Resource<List<EventDetail>>>()
    val eventDetails: LiveData<Resource<List<EventDetail>>>
        get() = _eventDetails

    init {
        fetchEventDetails()
    }

    private fun fetchEventDetails() {
        viewModelScope.launch {
            _eventDetails.postValue(Resource.loading(null))
            eventDetailsRepository.getEventDetails().let {
                if (it.isSuccessful) {
                    _eventDetails.postValue(Resource.success(it.body()?.eventDetailsList))
                } else _eventDetails.postValue(Resource.error(it.errorBody().toString(), null))
            }
        }
    }
}