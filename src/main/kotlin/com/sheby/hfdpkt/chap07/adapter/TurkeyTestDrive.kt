package com.sheby.hfdpkt.chap07.adapter

private fun Turkey.test() {
    this.apply {
        gobble()
        fly()
    }
}

fun main() {
    val duck = MallardDuck()
    val duckAdapter: Turkey = DuckAdapter(duck)
    val count = 10
    for (i in 0 until count) {
        println("The DuckAdapter says...")
        duckAdapter.test()
    }
}