package com.sheby.hfdpkt.chap06.command.undo.control

class StereoOffCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
    }
}