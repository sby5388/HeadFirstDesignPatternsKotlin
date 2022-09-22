package com.sheby.hfdpkt.chap07.facade

internal class DvdPlayer(private val description: String, private val amplifier: Amplifier) {
    private var currentTrack = 0
    private var movie: String? = null

    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun eject() {
        movie = null
        println("$description eject")
    }

    fun play(movie: String) {
        this.movie = movie
        currentTrack = 0
        println("$description playing \"$movie\"")
    }

    fun play(track: Int) {
        if (movie == null) {
            println("$description can't play track $track no dvd inserted")
        } else {
            currentTrack = track
            println("$description playing track $currentTrack of \"$movie\"")
        }
    }

    fun stop() {
        currentTrack = 0
        println("$description stopped \"$movie\"")
    }

    fun pause() {
        println("$description paused \"$movie\"")
    }

    fun setTwoChannelAudio() {
        println("$description set two channel audio")
    }

    fun setSurroundAudio() {
        println("$description set surround audio")
    }

    override fun toString(): String {
        return description
    }
}