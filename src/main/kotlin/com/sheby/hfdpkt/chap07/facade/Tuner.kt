package com.sheby.hfdpkt.chap07.facade

internal class Tuner(private val description: String, private var amplifier: Amplifier?) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun setFrequency(frequency: Double) {
        println("$description setting frequency to $frequency")
        val frequency1 = frequency
    }

    fun setAm() {
        println("$description setting AM mode")
    }

    fun setFm() {
        println("$description setting FM mode")
    }

    override fun toString(): String {
        return description
    }
}