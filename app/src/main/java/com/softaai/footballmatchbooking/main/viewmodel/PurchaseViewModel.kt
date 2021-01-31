package com.softaai.footballmatchbooking.main.viewmodel

import androidx.lifecycle.ViewModel
import com.softaai.footballmatchbooking.data.repository.PurchaseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PurchaseViewModel @Inject constructor(
    private val purchaseRepository: PurchaseRepository
) : ViewModel() {

}