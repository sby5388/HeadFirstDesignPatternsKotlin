package com.sheby.hfdpkt.chap06.command.undo.control

class HottubOffCommand(private val hottub: Hottub) : Command {
    override fun execute() {
        hottub.setTemperature(98)
        hottub.off()
    }

    override fun undo() {
        hottub.on()
    }
}