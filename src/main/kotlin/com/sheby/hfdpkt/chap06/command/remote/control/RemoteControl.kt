package com.sheby.hfdpkt.chap06.command.remote.control


private const val count = 7

class RemoteControl {
    private val noCommand = NoCommand()

    private
    val onCommands: Array<Command> = Array(count) {
        return@Array noCommand
    }

    private val offCommands: Array<Command> = Array(count) {
        return@Array noCommand
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
    }

    override fun toString(): String {
        val stringBuffer = StringBuffer()
        stringBuffer.append("\n------ Remote Control -------\n")
        for (i in 0 until count) {
            stringBuffer.append(
                """[slot $i] ${onCommands[i]::class.java.name}    ${offCommands[i]::class.java.name}
"""
            )
        }
        return stringBuffer.toString()
    }

}