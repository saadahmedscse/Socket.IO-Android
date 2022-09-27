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

        /**
         * For mobile One
         */
        val data = "{'doc': 'Saad', 'uid': '32', 'vid': 'sdf516sdf1'}"

        binding.buttonIncrease.setOnClickListener {
            socket.emit("data", data)
        }

        /**
         * For mobile two
         */
//        socket.on("data") { args ->
//            if (args[0] != null) {
//                val counter = args[0] as String
//
//                runOnUiThread {
//                    binding.counter.text = counter
//                }
//            }
//        }

        socket.connect()
    }
}