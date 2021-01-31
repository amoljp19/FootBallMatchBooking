package com.softaai.footballmatchbooking.main.viewmodel

import androidx.lifecycle.ViewModel
import com.softaai.footballmatchbooking.data.repository.AllEventsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AllEventsViewModel @Inject constructor(
    private val allEventsRepository: AllEventsRepository
) : ViewModel() {

}