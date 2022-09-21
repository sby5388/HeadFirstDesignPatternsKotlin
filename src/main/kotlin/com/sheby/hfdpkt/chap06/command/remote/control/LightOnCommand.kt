package com.sheby.hfdpkt.chap06.command.remote.control

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}