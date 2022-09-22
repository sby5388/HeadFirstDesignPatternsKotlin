package com.sheby.hfdpkt.chap08.templatemethod

class Coffee : CaffeineBeverage() {
    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }
}