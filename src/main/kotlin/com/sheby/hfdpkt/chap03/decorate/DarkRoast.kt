package com.sheby.hfdpkt.chap03.decorate

/**
 * 深培咖啡
 */
class DarkRoast : Beverage() {

    override fun cost(): Double {
        return 0.99
    }

    override var description: String
        get() = "Dark Roast Coffee"
        set(value) {}
}
