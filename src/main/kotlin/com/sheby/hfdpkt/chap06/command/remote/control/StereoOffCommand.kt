package com.sheby.hfdpkt.chap06.command.remote.control

class StereoOffCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }
}