package com.softaai.footballmatchbooking.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.softaai.footballmatchbooking.data.model.purchase.Purchase
import com.softaai.footballmatchbooking.data.repository.PurchaseRepository
import com.softaai.footballmatchbooking.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PurchaseViewModel @Inject constructor(
    private val purchaseRepository: PurchaseRepository
) : ViewModel() {

    private val _purchase = MutableLiveData<Resource<List<Purchase>>>()
    val purchase: LiveData<Resource<List<Purchase>>>
        get() = _purchase

    init {
        fetchPurchase()
    }

    private fun fetchPurchase() {
        viewModelScope.launch {
            _purchase.postValue(Resource.loading(null))
            purchaseRepository.getPurchase().let {
                if (it.isSuccessful) {
                    _purchase.postValue(Resource.success(it.body()!!.purchaseList))
                } else _purchase.postValue(Resource.error(it.errorBody().toString(), null))
            }
        }
    }
}