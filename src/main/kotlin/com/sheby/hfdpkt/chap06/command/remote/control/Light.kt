package com.sheby.hfdpkt.chap06.command.remote.control

class Light(private val location: String) {

    fun on() {
        println("$location Light is on")
    }

    fun off() {
        println("$location  Light is off")
    }
}