package com.sheby.hfdpkt.chap04.simple.factory

fun main() {
    val newYorkPizzaStore = NewYorkPizzaStore()
    val chicagoPizzaStore = ChicagoPizzaStore()

    var pizza = newYorkPizzaStore.orderPizza(TYPE_CHEESE)
    println("Ethan ordered a ${pizza.name} \n")
    pizza = chicagoPizzaStore.orderPizza(TYPE_CHEESE)

    println("Joel ordered a ${pizza.name} \n")

}