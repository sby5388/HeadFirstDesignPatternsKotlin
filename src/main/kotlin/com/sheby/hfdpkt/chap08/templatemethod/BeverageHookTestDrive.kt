package com.sheby.hfdpkt.chap08.templatemethod

fun main() {
    val teaHook = TeaWithHook()
    val coffeeHook = CoffeeWithHook()
    println("\nMaking tea...")
    teaHook.prepareRecipe()
    println("\nMaking coffee...")
    coffeeHook.prepareRecipe()
}