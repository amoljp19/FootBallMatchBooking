package com.softaai.footballmatchbooking.main.viewmodel

import androidx.lifecycle.*
import com.softaai.footballmatchbooking.data.model.allevents.AllEvent
import com.softaai.footballmatchbooking.data.repository.AllEventsRepository
import com.softaai.footballmatchbooking.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AllEventsViewModel @Inject constructor(
    private val allEventsRepository: AllEventsRepository
) : ViewModel() {

    private val _allEvents = MutableLiveData<Resource<List<AllEvent>>>()
    val allEvents: LiveData<Resource<List<AllEvent>>>
        get() = _allEvents

    private val _error = MutableLiveData<Resource<String>>()
    val error: LiveData<Resource<String>>
        get() = _error

    init {
        fetchAllEvents()
    }

    private fun fetchAllEvents() {
        viewModelScope.launch {
            _allEvents.postValue(Resource.loading(null))
            allEventsRepository.getAllEvents().let {
                    if (it.isSuccessful) {
                        _allEvents.postValue(Resource.success(it.body()))
                    } else _error.postValue(Resource.error(null, it.errorBody().toString()))
                }
        }
    }

}