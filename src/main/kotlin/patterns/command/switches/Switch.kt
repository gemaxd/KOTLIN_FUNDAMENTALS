package patterns.command.switches

import patterns.command.interfaces.Command

class Switch(private val onCommand: Command, private val offCommand: Command) {
    fun turnOn() {
        onCommand.execute()
    }

    fun turnOff() {
        offCommand.execute()
    }
}