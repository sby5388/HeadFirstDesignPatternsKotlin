package com.sheby.hfdpkt.chap06.command.undo.control


private const val count = 7

class RemoteControlWithUndo {
    private val noCommand = NoCommand()

    /**
     * 记住上一个执行的命令
     */
    private var undoCommand: Command = noCommand

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
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
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