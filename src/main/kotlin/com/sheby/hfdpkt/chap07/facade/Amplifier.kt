package com.sheby.hfdpkt.chap07.facade

internal class Amplifier(private val description: String) {
    private var dvd: DvdPlayer? = null
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun setStereoSound() {
        println("$description stereo mode on")
    }

    fun setSurroundSound() {
        println("$description surround sound on (5 speakers, 1 subwoofer)")
    }

    fun setVolume(level: Int) {
        println("$description setting volume to $level")
    }

    fun setTuner(tuner: Tuner) {
        println("$description setting tuner to $dvd")
        val tuner1 = tuner
    }

    fun setDvd(dvd: DvdPlayer) {
        println("$description setting DVD player to $dvd")
        this.dvd = dvd
    }

    fun setCd(cd: CdPlayer) {
        println("$description setting CD player to $cd")
        val cd1 = cd
    }

    override fun toString(): String {
        return description
    }
}