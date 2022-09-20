package com.sheby.hfdpkt.chap05.singleton

import kotlin.concurrent.thread

/**
 * 线程安全的单例
 * 使用双重检查加锁的方法：只适用于jdk5之后的
 */
class DoubleCheckSingleton private constructor() {

    init {
        println("DoubleCheckSingleton")
    }

    companion object {
        @Volatile
        private var sSingleton: DoubleCheckSingleton? = null
//            get() {
//                if (field == null) {
//                    synchronized(DoubleCheckSingleton::class) {
//                        if (field == null) {
//                            field = DoubleCheckSingleton()
//                        }
//                    }
//                }
//                return field
//            }

        @JvmStatic
        fun getInstance(): DoubleCheckSingleton {
            if (sSingleton == null) {
                synchronized(DoubleCheckSingleton::class) {
                    if (sSingleton == null) {
                        sSingleton = DoubleCheckSingleton()
                    }
                }
            }
            return sSingleton!!
        }
    }
}


fun main() {
    thread {
        println("thread ${DoubleCheckSingleton.getInstance()}")
    }
    println("main ${DoubleCheckSingleton.getInstance()}")

}