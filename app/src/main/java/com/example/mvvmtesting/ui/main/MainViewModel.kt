package com.example.mvvmtesting.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val title = MutableLiveData<String>()

    fun getData() {
        title.value = "Title from API"
    }
}
