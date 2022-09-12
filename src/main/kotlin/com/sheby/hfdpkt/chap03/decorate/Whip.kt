package com.sheby.hfdpkt.chap03.decorate

/**
 * 装饰者：奶油
 */
class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override fun cost(): Double {
        return beverage.cost() + when (size) {
            CoffeeSize.TALL -> 0.05
            CoffeeSize.GRANDE -> 0.10
            CoffeeSize.VENTI -> 0.15
        }
    }

    override var description: String
        get() = "${beverage.description}, Whip"
        set(value) {}
}