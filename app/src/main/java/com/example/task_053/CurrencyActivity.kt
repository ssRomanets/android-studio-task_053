package com.example.task_053

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_053.databinding.ActivityCurrencyBinding

class CurrencyActivity : AppCompatActivity() {

    private lateinit var currencyAdapter: CurrencyAdapter
    private lateinit var binding: ActivityCurrencyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currencyRepository = CurrencyRepository()
        val currencyViewModelFactory = CurrencyViewModelFactory(currencyRepository)
        val currencyViewModel = ViewModelProvider(this, currencyViewModelFactory).get(CurrencyViewModel::class.java)

        currencyAdapter = CurrencyAdapter()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = currencyAdapter

        currencyViewModel.currencyList.observe(this, { currencyList ->
            currencyList?.let {
                currencyAdapter.setData(currencyList)
            }
        })
    }
}