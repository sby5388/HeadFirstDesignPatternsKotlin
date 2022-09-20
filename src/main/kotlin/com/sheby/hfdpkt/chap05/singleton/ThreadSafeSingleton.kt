package com.sheby.hfdpkt.chap05.singleton

import kotlin.concurrent.thread

/**
 * 线程安全的单例
 * 使用锁
 */
class ThreadSafeSingleton private constructor() {

    init {
        println("ThreadSafeSingleton")
    }

    companion object {
        private var singleton: ThreadSafeSingleton? = null

        @JvmStatic
        @Synchronized
        fun getInstance(): ThreadSafeSingleton {
            if (singleton == null) {
                singleton = ThreadSafeSingleton()
            }
            return singleton!!
        }

    }
}

fun main() {
    thread {
        println("thread ${ThreadSafeSingleton.getInstance()}")
    }
    println("main ${ThreadSafeSingleton.getInstance()}")
}