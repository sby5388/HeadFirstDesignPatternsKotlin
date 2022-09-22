package com.sheby.hfdpkt.chap07.adapter

import kotlin.random.Random


class DuckAdapter(private val duck: Duck) : Turkey {
    private val rand: Random = Random.Default

    override fun gobble() {
        duck.quack()
    }

    override fun fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly()
        }
    }
}