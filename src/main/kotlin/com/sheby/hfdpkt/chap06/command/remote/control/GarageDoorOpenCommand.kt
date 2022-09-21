package com.sheby.hfdpkt.chap06.command.remote.control

class GarageDoorOpenCommand(private val door: GarageDoor) : Command {
    override fun execute() = door.up()
}