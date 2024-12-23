package com.example.task_053

import kotlinx.coroutines.delay

class CurrencyRepository {
    suspend fun getCurrencyList(): List<Currency> {
        delay(2000)
        return listOf(
            Currency(1, R.drawable.ada, "ada", 1.1319795185),
            Currency(2, R.drawable.aed, "aed", 3.672750405),
            Currency(3, R.drawable.afn, "afn", 70.0680405654),
            Currency(4, R.drawable.amd, "amd", 392.8170606445),
            Currency(5, R.drawable.ang, "ang", 1.7870802143),
            Currency(6, R.drawable.bob, "bob", 6.9273409325)
        )
    }
}