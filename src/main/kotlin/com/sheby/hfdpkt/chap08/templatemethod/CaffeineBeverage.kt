package com.sheby.hfdpkt.chap08.templatemethod

/**
 * 咖啡因饮料
 */
abstract class CaffeineBeverage {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    abstract fun brew()
    abstract fun addCondiments()
    private fun boilWater() {
        println("Boiling water")
    }

    private fun pourInCup() {
        println("Pouring into cup")
    }
}