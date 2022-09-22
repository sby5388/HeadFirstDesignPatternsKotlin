package com.sheby.hfdpkt.chap07.adapter

/**
 * 野生火鸡
 */
class WildTurkey : Turkey {
    override fun gobble() {
        println("Gobble gobble")
    }

    override fun fly() {
        println("I'm flying a short distance")
    }
}