package com.sheby.hfdpkt.chap06.command.undo.control

class TV(private val location: String) {
    fun on() {
        println("$location TV is on")
    }

    fun off() {
        println("$location TV is off")
    }

    fun setInputChannel() {
        val channel = 3
        println("$location TV channel is set for DVD")
    }
}