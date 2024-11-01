package com.sorteio.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SplashViewModel : ViewModel() {

    private val _navigateToMain = MutableLiveData(false)
    val navigateToMain: LiveData<Boolean> get() = _navigateToMain

    init {
        startSplashTimer()
    }

    private fun startSplashTimer() {
        Handler(Looper.getMainLooper()).postDelayed({
            _navigateToMain.value = true
        }, 3000) // 3 segundos
    }
}