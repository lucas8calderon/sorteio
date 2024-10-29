package com.sorteio.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.sorteio.databinding.ActivityMainBinding
import com.sorteio.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel.numberSet.observe(this) { numbers ->
            binding.firstNumber.text = numbers.firstNumber.toString()
            binding.secondNumber.text = numbers.secondNumber.toString()
            binding.thirdNumber.text = numbers.thirdNumber.toString()
            binding.fourthNumber.text = numbers.fourthNumber.toString()
            binding.fifthNumber.text = numbers.fifthNumber.toString()
            binding.sixthNumber.text = numbers.sixthNumber.toString()
            binding.textResult.visibility = View.VISIBLE
        }

        binding.generateNumbers.setOnClickListener {
            viewModel.generateNumbers()
        }

        binding.clearNumbers.setOnClickListener {
            viewModel.clearNumbers()
            binding.textResult.visibility = View.INVISIBLE
        }
    }
}