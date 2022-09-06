package com.sheby.hfdpkt.chap01.strategy

fun main() {
    val mallardDuck: Duck = MallardDuck()
    mallardDuck.performQuack()
    mallardDuck.performFly()

    val modelDuck: Duck = ModelDuck()
    modelDuck.display()
    modelDuck.performFly()
    modelDuck.flyBehavior = FlyRocketPowered()
    modelDuck.performFly()
}