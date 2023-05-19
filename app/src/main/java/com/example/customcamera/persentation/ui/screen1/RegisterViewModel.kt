package com.example.customcamera.persentation.ui.screen1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is screen1 Fragment"
    }
    val text: LiveData<String> = _text
}