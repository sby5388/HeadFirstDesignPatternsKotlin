package com.sheby.hfdpkt.chap05.singleton

import kotlin.concurrent.thread

/**
 * 饿汉模式的单例：线程安全
 */
class HungrySingleton private constructor() {
    init {
        println("HungrySingleton")
    }

    companion object {
        private var singleton = HungrySingleton()

        @JvmStatic
        fun getInstance(): HungrySingleton {
            return singleton
        }
    }

}


fun main() {
    // TODO: 理论上 要先打印 "HungrySingleton"再打印 "main--"的
    //  可能是kotlin 编译出来的多了个HungrySingletonKt.class，而这main函数在这个类里面
    println("main--")
    thread {
        println("thread ${HungrySingleton.getInstance()}")
    }
    println("main ${HungrySingleton.getInstance()}")

}