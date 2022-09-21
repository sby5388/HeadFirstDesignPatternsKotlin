package com.sheby.hfdpkt.chap06.command.undo.control

/**
 * 天花板吊扇
 */
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
        const val HIGH = 3
        const val MEDIUM = 2
        const val LOW = 1
        const val OFF = 0
    }
}