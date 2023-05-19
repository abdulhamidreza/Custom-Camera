package com.example.customcamera.persentation.ui.screen2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SingleTakeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is screen2 Fragment"
    }
    val text: LiveData<String> = _text
}