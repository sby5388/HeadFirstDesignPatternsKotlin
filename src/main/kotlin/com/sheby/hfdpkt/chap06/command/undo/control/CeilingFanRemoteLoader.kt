package com.sheby.hfdpkt.chap06.command.undo.control

/**
 * 测试风扇的undo
 */
fun main() {
    val remoteControl = RemoteControlWithUndo()

    val ceilingFan = CeilingFan("Living Room")


    val ceilingFanMedium = CeilingFanMediumCommand(ceilingFan)
    val ceilingFanHigh = CeilingFanHighCommand(ceilingFan)
    val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

    remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff)
    remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff)

    remoteControl.onButtonWasPushed(0)//中
    remoteControl.offButtonWasPushed(0)//关
    println(remoteControl)
    remoteControl.undoButtonWasPushed()//关->中

    remoteControl.onButtonWasPushed(1)//中->高
    println(remoteControl)
    remoteControl.undoButtonWasPushed()//高->中
    // TODO: 如果撤回按钮连续按了2次呢

}