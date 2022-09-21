package com.sheby.hfdpkt.chap06.command.remote.control

class CeilingFanOnCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.high()
    }
}