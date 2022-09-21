package com.sheby.hfdpkt.chap06.command.remote.control

class LightOffCommand(private val light: Light) : Command {
    override fun execute() = light.off()
}