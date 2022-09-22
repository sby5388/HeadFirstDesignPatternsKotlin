package com.sheby.hfdpkt.chap08.templatemethod

fun main() {
    val tea = Tea()
    val coffee = Coffee()
    println("\nMaking tea...")
    tea.prepareRecipe()
    println("\nMaking coffee...")
    coffee.prepareRecipe()
}