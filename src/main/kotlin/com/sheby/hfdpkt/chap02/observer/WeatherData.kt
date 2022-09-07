package com.sheby.hfdpkt.chap02.observer

class WeatherData : Subject {

    private val observerList: MutableList<Observer> = mutableListOf()

    private var temperature = 0.0f
    private var humidity = 0.0f
    private var pressure = 0.0f


    override fun registerObserver(observer: Observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer)
        }
    }

    override fun unregisterObserver(observer: Observer) {
        observerList.remove(observer)
    }

    override fun notifyObservers() {
        observerList.forEach {
            it.onUpdate(temperature, humidity, pressure)
        }
    }


    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.humidity = humidity
        this.pressure = pressure
        this.temperature = temperature
        measurementsChanged()
    }

}