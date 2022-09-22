package com.sheby.hfdpkt.chap08.templatemethod

/**
 * 带钩子的咖啡因饮料
 */
abstract class CaffeineBeverageWithHook {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    abstract fun brew()
    abstract fun addCondiments()
    private fun boilWater() {
        println("Boiling water")
    }

    private fun pourInCup() {
        println("Pouring into cup")
    }

    open fun customerWantsCondiments(): Boolean {
        return true
    }
}