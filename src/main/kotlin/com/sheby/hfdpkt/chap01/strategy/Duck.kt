package com.sheby.hfdpkt.chap01.strategy

abstract class Duck(var quackBehavior: QuackBehavior, var flyBehavior: FlyBehavior) {

    fun swim() {

    }

    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

}

class MallardDuck : Duck(Quack(), FlyWithWings()) {
    override fun display() {
        println("I'm a real Mallard duck")
    }
}

/**
 * 模型鸭
 */
class ModelDuck : Duck(Quack(), FlyNoWay()) {
    override fun display() {
        println("I'm a model duck")
    }
}