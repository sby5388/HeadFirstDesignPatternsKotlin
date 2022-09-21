package com.sheby.hfdpkt.chap06.command.undo.control

/**
 * 热浴缸
 */
class Hottub {
    private var on = false
    private var temperature = 0
    fun on() {
        on = true
    }

    fun off() {
        on = false
    }

    fun circulate() {
        if (on) {
            println("Hottub is bubbling!")
        }
    }

    fun jetsOn() {
        if (on) {
            println("Hottub jets are on")
        }
    }

    fun jetsOff() {
        if (on) {
            println("Hottub jets are off")
        }
    }

    fun setTemperature(temperature: Int) {
        if (temperature > this.temperature) {
            println("Hottub is heating to a steaming $temperature degrees")
        } else {
            println("Hottub is cooling to $temperature degrees")
        }
        this.temperature = temperature
    }
}