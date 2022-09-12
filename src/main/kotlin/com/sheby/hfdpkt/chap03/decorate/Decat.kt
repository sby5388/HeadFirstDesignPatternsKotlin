package com.sheby.hfdpkt.chap03.decorate

/**
 * 低咖啡因
 */
class Decat : Beverage() {
    override var description: String
        get() = "Decat"
        set(value) {}

    override fun cost(): Double {
        return 1.05
    }
}