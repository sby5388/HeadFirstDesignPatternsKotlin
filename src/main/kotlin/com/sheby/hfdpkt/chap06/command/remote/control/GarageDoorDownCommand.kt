package com.sheby.hfdpkt.chap06.command.remote.control

class GarageDoorDownCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }
}