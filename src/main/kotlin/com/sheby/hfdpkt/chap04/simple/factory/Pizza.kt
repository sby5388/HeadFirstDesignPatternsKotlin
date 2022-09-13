package com.sheby.hfdpkt.chap04.simple.factory

/**
 * 一个pizza
 * name:名称
 * dough:面团类型
 * sauce:佐料
 */
abstract class Pizza(val name: String, val dough: String, val sauce: String) {
    /**
     * 一套佐料
     */
    val toppings = mutableListOf<String>()


    open fun prepare() {
        println("Preparing $name")
        println("Tossing dough ...")
        println("Adding sauce...")
        println("Adding toppings")
        toppings.forEach {
            println(" $it")
        }
    }

    open fun bake() {
        println("Bake for 25 minutes at 350")

    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }
}

