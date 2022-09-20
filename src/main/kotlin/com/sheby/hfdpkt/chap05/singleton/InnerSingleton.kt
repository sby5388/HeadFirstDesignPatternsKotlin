package com.sheby.hfdpkt.chap05.singleton

import kotlin.concurrent.thread

/**
 *相当于JAVA的静态内部类单例
 * 参考自
 * https://blog.csdn.net/qq_40987010/article/details/122499694
 */
class InnerSingleton private constructor() {
    init {
        println("InnerSingleton")
    }

    private object InnerHolder {
        val singleton = InnerSingleton()
    }

    companion object {
        @JvmStatic
        fun getInstance(): InnerSingleton {
            return InnerHolder.singleton
        }
    }

}

fun main() {
    thread {
        println("thread ${InnerSingleton.getInstance()}")
    }
    println("main ${InnerSingleton.getInstance()}")
}