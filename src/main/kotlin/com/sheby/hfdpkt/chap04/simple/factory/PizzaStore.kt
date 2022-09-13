package com.sheby.hfdpkt.chap04.simple.factory

const val TYPE_CHEESE = "cheese"
const val TYPE_VEGGIE = "veggie"
const val TYPE_CLAM = "clam"
const val TYPE_PEPPERONI = "pepperoni"

abstract class PizzaStore {

    abstract fun createPizza(type: String): Pizza

    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }


}