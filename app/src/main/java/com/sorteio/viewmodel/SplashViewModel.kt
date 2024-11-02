package com.sorteio.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    companion object {
        private const val SPLASH_DELAY = 3000L
    }

    private val _navigateToMain = MutableLiveData(false)
    val navigateToMain: LiveData<Boolean> get() = _navigateToMain

    init {
        startSplashTimer()
    }

    private fun startSplashTimer() {
        viewModelScope.launch {
            delay(SPLASH_DELAY)
            _navigateToMain.value = true
        }
    }
}