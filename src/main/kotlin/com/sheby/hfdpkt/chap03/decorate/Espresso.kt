package com.sheby.hfdpkt.chap03.decorate

/**
 * 浓缩咖啡
 */
class Espresso : Beverage() {
    override var description: String
        get() = "Espresso"
        set(value) {}

    override fun cost(): Double {
        return 1.99
    }
}