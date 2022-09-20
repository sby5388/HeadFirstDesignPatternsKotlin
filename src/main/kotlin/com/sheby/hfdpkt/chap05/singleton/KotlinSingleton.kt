package com.sheby.hfdpkt.chap05.singleton

import kotlin.concurrent.thread

object KotlinSingleton {
    init {
        println("create KotlinSingleton ${Thread.currentThread().name}}")
        Thread.sleep(200)
    }
}

fun main() {
    thread {
        println("thread $KotlinSingleton")
    }
    println("main $KotlinSingleton")
}