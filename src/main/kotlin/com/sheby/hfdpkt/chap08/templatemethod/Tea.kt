package com.sheby.hfdpkt.chap08.templatemethod

internal class Tea : CaffeineBeverage() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }
}