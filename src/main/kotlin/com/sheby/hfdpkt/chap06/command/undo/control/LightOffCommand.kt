package com.sheby.hfdpkt.chap06.command.undo.control

class LightOffCommand(private val light: Light) : Command {
    override fun execute() = light.off()

    override fun undo() {
        light.on()
    }
}