package com.example.omsdgcaters.ui.purchase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PurchaseViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is purchase Fragment"
    }
    val text: LiveData<String> = _text
}