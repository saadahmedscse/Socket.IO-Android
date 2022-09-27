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

        val socket = SocketHandler.getSocket()
        socket.connect()

        binding.buttonIncrease.setOnClickListener {
            socket.emit("counter")
        }

        socket.on("counter") { args ->
            if (args[0] != null) {
                val counter = args[0] as Int

                runOnUiThread {
                    binding.counter.text = counter.toString()
                }
            }
        }
    }
}