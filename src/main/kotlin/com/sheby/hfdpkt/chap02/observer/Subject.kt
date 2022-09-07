package com.sheby.hfdpkt.chap02.observer

/**
 * 发布者
 */
interface Subject {

    /**
     * 注册观察者
     */
    fun registerObserver(observer: Observer)

    /**
     * 移除观察者
     */
    fun unregisterObserver(observer: Observer)

    /**
     * 通知观察者
     */
    fun notifyObservers()

}