package com.example.task_053

import android.content.Intent
import android.os.Handler
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_053.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            val intent = Intent(this, CurrencyActivity::class.java)
            startActivity(intent)
        }, 5000)
    }
}




