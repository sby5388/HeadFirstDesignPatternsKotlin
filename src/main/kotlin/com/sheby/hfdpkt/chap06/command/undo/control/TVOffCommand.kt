package com.sheby.hfdpkt.chap06.command.undo.control

class TVOffCommand(private val tv: TV) : Command {
    override fun execute() {
        tv.off()
    }

    override fun undo() {
        tv.on()
    }
}