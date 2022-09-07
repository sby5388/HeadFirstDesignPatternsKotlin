package com.sheby.hfdpkt.chap02.observer

class CurrentConditionsDisplay(private val subject: Subject) : Observer, DisplayElement {

    private var temperature = 0.0f
    private var humidity = 0.0f

    init {
        subject.registerObserver(this)
    }

    override fun onUpdate(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }
}