package com.sheby.hfdpkt.chap06.command.remote.control

class StereoOnWithCDCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.apply {
            on()
            setCD()
            setVolume(11)
        }
    }
}