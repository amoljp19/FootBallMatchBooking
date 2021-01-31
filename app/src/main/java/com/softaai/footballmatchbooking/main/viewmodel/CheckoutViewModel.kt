package com.softaai.footballmatchbooking.main.viewmodel

import androidx.lifecycle.ViewModel
import com.softaai.footballmatchbooking.data.repository.CheckoutRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CheckoutViewModel @Inject constructor(
    private val checkoutRepository: CheckoutRepository
) : ViewModel() {

}