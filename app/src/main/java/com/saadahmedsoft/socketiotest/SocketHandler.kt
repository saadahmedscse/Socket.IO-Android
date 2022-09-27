package com.saadahmedsoft.socketiotest

import io.socket.client.IO
import io.socket.client.Socket

object SocketHandler {
    private lateinit var socket: Socket

    @Synchronized
    fun getSocket(): Socket {
        try {
            socket = IO.socket("http://192.168.1.22:3000")
        } catch (_: Exception) {}

        return socket
    }
}