package com.sheby.hfdpkt.chap06.command.undo.control

/**
 * 让风扇低速的命令
 */
class CeilingFanLowCommand(private val ceilingFan: CeilingFan) : Command {
    /**
     * 风扇加速前的风速，用于undo时设置风速
     */
    var preSpeed = ceilingFan.speed

    override fun execute() {
        preSpeed = ceilingFan.speed
        ceilingFan.low()
    }

    override fun undo() {
        when (preSpeed) {
            CeilingFan.HIGH -> ceilingFan.high()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.OFF -> ceilingFan.off()
            else -> ceilingFan.off()
        }
    }
}