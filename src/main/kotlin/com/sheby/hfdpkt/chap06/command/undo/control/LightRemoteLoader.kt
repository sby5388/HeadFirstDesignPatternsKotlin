package com.sheby.hfdpkt.chap06.command.undo.control

/**
 * 测试灯光的undo
 */
fun main() {
    val remoteControl = RemoteControlWithUndo()

    val livingRoomLight = Light("Living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)
    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    println(remoteControl)
    remoteControl.undoButtonWasPushed()

    remoteControl.offButtonWasPushed(0)
    remoteControl.onButtonWasPushed(0)
    println(remoteControl)
    remoteControl.undoButtonWasPushed()

}