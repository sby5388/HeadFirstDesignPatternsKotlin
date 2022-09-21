package com.sheby.hfdpkt.chap06.command.remote.control

class CeilingFanOffCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.off()
    }
}