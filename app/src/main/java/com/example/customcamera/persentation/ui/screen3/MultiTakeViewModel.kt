package com.example.customcamera.persentation.ui.screen3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MultiTakeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is screen3 Fragment"
    }
    val text: LiveData<String> = _text
}