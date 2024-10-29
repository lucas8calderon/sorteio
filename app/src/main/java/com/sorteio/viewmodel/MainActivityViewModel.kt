package com.sorteio.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sorteio.model.NumberSet

class MainActivityViewModel : ViewModel() {

    private val _numberSet = MutableLiveData<NumberSet>()
    val numberSet: LiveData<NumberSet> get() = _numberSet

    fun generateNumbers() {
        _numberSet.value = NumberSet(
            firstNumber = (1..60).random(),
            secondNumber = (1..60).random(),
            thirdNumber = (1..60).random(),
            fourthNumber = (1..60).random(),
            fifthNumber = (1..60).random(),
            sixthNumber = (1..60).random()
        )
    }

    fun clearNumbers() {
        _numberSet.value = NumberSet()
    }
}
