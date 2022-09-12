package com.sheby.hfdpkt.chap03.decorate

/**
 * 装饰者：摩卡
 */
class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String
        get() = "${beverage.description}, Mocha"
        set(value) {}

    override fun cost(): Double {
        return 0.20 + beverage.cost()
    }


}