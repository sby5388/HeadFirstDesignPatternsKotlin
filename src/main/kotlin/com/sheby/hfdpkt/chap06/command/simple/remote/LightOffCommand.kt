package com.sheby.hfdpkt.chap06.command.simple.remote

class LightOffCommand(private val light: Light) : Command {
    override fun execute() = light.off()
}