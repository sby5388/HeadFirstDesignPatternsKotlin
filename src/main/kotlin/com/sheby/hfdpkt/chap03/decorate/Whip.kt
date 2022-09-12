package com.sheby.hfdpkt.chap03.decorate

/**
 * 装饰者：奶油
 */
class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override fun cost(): Double {
        return 0.10 + beverage.cost()
    }

    override var description: String
        get() = "${beverage.description}, Whip"
        set(value) {}
}