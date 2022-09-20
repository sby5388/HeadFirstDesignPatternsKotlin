package com.sheby.hfdpkt.chap05.singleton

import kotlin.concurrent.thread

/**
 * 线程不安全的单例：传统方法
 */
class ThreadNotSafeSingleton private constructor() {

    init {
        println("ThreadNotSafeSingleton")
    }

    companion object {

        private var singleton: ThreadNotSafeSingleton? = null
            get() {
                if (field == null) {
                    field = ThreadNotSafeSingleton()
                }
                return field
            }

        @JvmStatic
        fun getInstance(): ThreadNotSafeSingleton {
            return singleton!!
        }
    }

}

fun main() {
    thread {
        println("thread ${ThreadNotSafeSingleton.getInstance()}")
    }
    println("main ${ThreadNotSafeSingleton.getInstance()}")

}