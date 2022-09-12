package com.sheby.hfdpkt.chap03.decorate

/**
 * 综合咖啡
 */
class HouseBlend : Beverage() {
    override fun cost(): Double {
        return .89
    }

    override var description: String
        get() = "House Blend Coffee"
        set(value) {}

}