package com.sheby.hfdpkt.chap07.facade

internal class Screen(private val description: String) {
    fun up() {
        println("$description going up")
    }

    fun down() {
        println("$description going down")
    }

    override fun toString(): String {
        return description
    }
}