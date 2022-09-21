package com.sheby.hfdpkt.chap06.command.remote.control

class CeilingFan(private val location: String) {
    var speed = 0
        private set

    fun high() {
        // turns the ceiling fan on to high
        speed = HIGH
        println("$location ceiling fan is on high")
    }

    fun medium() {
        // turns the ceiling fan on to medium
        speed = MEDIUM
        println("$location ceiling fan is on medium")
    }

    fun low() {
        // turns the ceiling fan on to low
        speed = LOW
        println("$location ceiling fan is on low")
    }

    fun off() {
        // turns the ceiling fan off
        speed = 0
        println("$location ceiling fan is off")
    }

    companion object {
        private const val HIGH = 2
        private const val MEDIUM = 1
        private const val LOW = 0
    }
}