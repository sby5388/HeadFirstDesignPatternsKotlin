package com.sheby.hfdpkt.chap06.command.simple.remote

class GarageDoorOpenCommand(private val door: GarageDoor) : Command {
    override fun execute() = door.up()
}