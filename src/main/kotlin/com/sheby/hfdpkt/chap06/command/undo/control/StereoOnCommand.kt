package com.sheby.hfdpkt.chap06.command.undo.control

class StereoOnCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
    }

    override fun undo() {
        stereo.off()
    }
}