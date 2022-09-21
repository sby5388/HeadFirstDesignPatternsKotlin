package com.sheby.hfdpkt.chap06.command.undo.control

class MacroCommand(private val commands: Array<Command>) : Command {
    override fun execute() {
        commands.forEach {
            it.execute()
        }
    }

    override fun undo() {
        commands.forEach {
            it.undo()
        }
    }
}