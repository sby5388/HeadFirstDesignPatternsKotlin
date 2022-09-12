package com.sheby.hfdpkt.chap03.decorate

/**
 * Condiment:调料
 * CondimentDecorator:调料装饰者
 */
abstract class CondimentDecorator : Beverage() {
    abstract override var description: String
}