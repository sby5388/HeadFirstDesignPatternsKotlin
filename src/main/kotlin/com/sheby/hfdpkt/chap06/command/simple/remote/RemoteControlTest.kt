package com.sheby.hfdpkt.chap06.command.simple.remote

fun main() {
    val control = SimpleRemoteControl()
    val light = Light()
    val lightOn: Command = LightOnCommand(light)

    control.command = lightOn
    control.buttonWasPressed()

    val door = GarageDoor()
    val doorOpenCommand = GarageDoorOpenCommand(door)

    control.command = doorOpenCommand
    control.buttonWasPressed()

}