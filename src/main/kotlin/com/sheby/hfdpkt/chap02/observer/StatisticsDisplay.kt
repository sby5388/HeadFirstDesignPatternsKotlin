package com.sheby.hfdpkt.chap02.observer

class StatisticsDisplay(private val subject: Subject) : Observer, DisplayElement {
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    init {
        subject.registerObserver(this)
    }


    override fun onUpdate(temperature: Float, humidity: Float, pressure: Float) {
        tempSum += temperature
        numReadings++

        if (temperature > maxTemp) {
            maxTemp = temperature
        }

        if (temperature < minTemp) {
            minTemp = temperature
        }
        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = ${tempSum / numReadings}/${maxTemp}/${minTemp}")
    }
}