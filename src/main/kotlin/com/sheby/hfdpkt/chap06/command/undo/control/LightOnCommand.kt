package com.sheby.hfdpkt.chap06.command.undo.control

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}