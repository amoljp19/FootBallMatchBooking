package com.softaai.footballmatchbooking.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.softaai.footballmatchbooking.data.model.allevents.AllEvent
import com.softaai.footballmatchbooking.data.model.checkout.Checkout
import com.softaai.footballmatchbooking.data.repository.CheckoutRepository
import com.softaai.footballmatchbooking.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CheckoutViewModel @Inject constructor(
    private val checkoutRepository: CheckoutRepository
) : ViewModel() {
    private val _checkout = MutableLiveData<Resource<List<Checkout>>>()
    val checkout: LiveData<Resource<List<Checkout>>>
        get() = _checkout

    private val _error = MutableLiveData<Resource<String>>()
    val error: LiveData<Resource<String>>
        get() = _error

    init {
        fetchCheckout()
    }

    private fun fetchCheckout() {
        viewModelScope.launch {
            _checkout.postValue(Resource.loading(null))
            checkoutRepository.getCheckout().let {
                if (it.isSuccessful) {
                    _checkout.postValue(Resource.success(it.body()?.checkoutList))
                } else _checkout.postValue(Resource.error(it.errorBody().toString(), null))
            }
        }
    }
}