package com.sheby.hfdpkt.chap06.command.undo.control

class HottubOnCommand(private val hottub: Hottub) : Command {
    override fun execute() {
        hottub.on()
        hottub.setTemperature(104)
        hottub.circulate()
    }

    override fun undo() {
        hottub.off()
    }
}