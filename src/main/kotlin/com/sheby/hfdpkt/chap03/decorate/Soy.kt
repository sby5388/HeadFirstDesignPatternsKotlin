package com.sheby.hfdpkt.chap03.decorate

/**
 * 装饰者
 * soy:大豆，豆浆
 */
class Soy(private val beverage: Beverage) : CondimentDecorator() {
    /**
     * 豆浆调料根据咖啡容量收费
     */
    override fun cost(): Double {
        return beverage.cost() + when (size) {
            CoffeeSize.TALL -> 0.10
            CoffeeSize.GRANDE -> 0.15
            CoffeeSize.VENTI -> 0.20
        }
    }

    override var description: String
        get() = "${beverage.description}, Soy"
        set(value) {}
}