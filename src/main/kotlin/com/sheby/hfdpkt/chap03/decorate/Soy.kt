package com.sheby.hfdpkt.chap03.decorate

/**
 * 装饰者
 * soy:大豆，豆浆
 */
class Soy(private val beverage: Beverage) : CondimentDecorator() {
    override fun cost(): Double {
        return 0.15 + beverage.cost()
    }

    override var description: String
        get() = "${beverage.description}, Soy"
        set(value) {}
}