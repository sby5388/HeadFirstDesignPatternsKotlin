package com.sheby.hfdpkt.chap03.decorate

/**
 * 饮料
 */
abstract class Beverage {

    open var size: CoffeeSize = CoffeeSize.TALL

    open var description = "Unknown Beverage"

    /**
     * 价格
     */
    abstract fun cost(): Double


}