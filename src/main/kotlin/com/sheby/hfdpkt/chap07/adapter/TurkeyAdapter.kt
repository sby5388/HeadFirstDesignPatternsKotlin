package com.sheby.hfdpkt.chap07.adapter

/**
 * 鸭子适配器：利用火鸡冒充鸭子
 */
class TurkeyAdapter(private val turkey: Turkey) : Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for (i in 0 until 5) {
            turkey.fly()
        }
    }
}