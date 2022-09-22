package com.sheby.hfdpkt.chap07.facade

internal class HomeTheaterFacade(
    private val amp: Amplifier,
    private val tuner: Tuner,
    private val dvd: DvdPlayer,
    private val cd: CdPlayer,
    private val projector: Projector,
    private val screen: Screen,
    private val lights: TheaterLights,
    private val popper: PopcornPopper
) {
    fun watchMovie(movie: String) {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.setDvd(dvd)
        amp.setSurroundSound()
        amp.setVolume(5)
        dvd.on()
        dvd.play(movie)
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        dvd.stop()
        dvd.eject()
        dvd.off()
    }

    fun listenToCd(cdTitle: String) {
        println("Get ready for an audioPile experience...")
        lights.on()
        amp.on()
        amp.setVolume(5)
        amp.setCd(cd)
        amp.setStereoSound()
        cd.on()
        cd.play(cdTitle)
    }

    fun endCd() {
        println("Shutting down CD...")
        amp.off()
        amp.setCd(cd)
        cd.eject()
        cd.off()
    }

    fun listenToRadio(frequency: Double) {
        println("Tuning in the airwaves...")
        tuner.on()
        tuner.setFrequency(frequency)
        amp.on()
        amp.setVolume(5)
        amp.setTuner(tuner)
    }

    fun endRadio() {
        println("Shutting down the tuner...")
        tuner.off()
        amp.off()
    }
}