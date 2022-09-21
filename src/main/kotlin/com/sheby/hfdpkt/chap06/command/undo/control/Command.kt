package com.sheby.hfdpkt.chap06.command.undo.control

interface Command {
    /**
     * 执行命令
     */
    fun execute()

    /**
     * 撤销命令：其实是执行一个与上一个命令相反效果的命令
     */
    fun undo()
}