package com.sheby.hfdpkt.chap02.observer

/**
 * 观察者
 */
interface Observer {
    /**
     * 当数据变化时
     * @param temperature  温度
     * @param humidity 相对湿度
     * @param pressure 气压
     */
    fun onUpdate(temperature: Float, humidity: Float, pressure: Float)
}