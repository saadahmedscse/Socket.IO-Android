package com.saadahmedsoft.socketiotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saadahmedsoft.socketiotest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0

        binding.buttonIncrease.setOnClickListener {
            count++
            binding.counter.text = count.toString()
        }
    }
}