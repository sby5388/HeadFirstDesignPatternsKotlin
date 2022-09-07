package com.sheby.hfdpkt.chap02.observer

class HeatIndexDisplay(private val subject: Subject) : Observer, DisplayElement {
    private var heatIndex = 0.0f

    init {
        subject.registerObserver(this)
    }

    override fun onUpdate(temperature: Float, humidity: Float, pressure: Float) {
        heatIndex = computeHeatIndex(temperature, humidity)
        display()
    }

    override fun display() {
        println("Heat index is $heatIndex")

    }

    /**
     * 计算酷热指数
     * @param t:温度
     * @param rh:相对湿度
     */
    private fun computeHeatIndex(t: Float, rh: Float): Float {
        return (16.923 + 0.185212 * t + 5.37941 * rh - 0.100254 * t * rh + 0.00941695 * (t * t) + 0.00728898 * (rh * rh) + 0.000345372 * (t * t * rh) - 0.000814971 * (t * rh * rh) + 0.0000102102 * (t * t * rh * rh) - 0.000038646 * (t * t * t) + 0.0000291583 * (rh * rh * rh) + 0.00000142721 * (t * t * t * rh) + 0.000000197483 * (t * rh * rh * rh) - 0.0000000218429 * (t * t * t * rh * rh) +
                0.000000000843296 * (t * t * rh * rh * rh) - 0.0000000000481975 * (t * t * t * rh * rh * rh)).toFloat()
    }
}