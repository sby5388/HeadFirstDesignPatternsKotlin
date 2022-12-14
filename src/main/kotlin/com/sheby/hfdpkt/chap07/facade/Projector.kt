package com.sheby.hfdpkt.chap07.facade

internal class Projector(private val description: String, private val dvdPlayer: DvdPlayer) {

    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun wideScreenMode() {
        println("$description in widescreen mode (16x9 aspect ratio)")
    }

    fun tvMode() {
        println("$description in tv mode (4x3 aspect ratio)")
    }

    override fun toString(): String {
        return description
    }
}