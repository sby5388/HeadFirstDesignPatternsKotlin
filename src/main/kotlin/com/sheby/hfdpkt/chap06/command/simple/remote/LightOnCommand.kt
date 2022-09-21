package com.sheby.hfdpkt.chap06.command.simple.remote

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}