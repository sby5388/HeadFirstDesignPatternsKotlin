package com.sheby.hfdpkt.chap06.command.simple.remote

class SimpleRemoteControl {
    var command: Command? = null

    fun buttonWasPressed() {
        command?.execute()
    }
}