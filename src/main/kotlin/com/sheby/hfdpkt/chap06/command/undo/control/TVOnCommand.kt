package com.sheby.hfdpkt.chap06.command.undo.control

class TVOnCommand(private val tv: TV) : Command {
    override fun execute() {
        tv.on()
        tv.setInputChannel()
    }

    override fun undo() {
        tv.off()
    }
}