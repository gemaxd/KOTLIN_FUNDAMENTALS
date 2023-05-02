package patterns.command.commands

import patterns.command.interfaces.Command
import patterns.command.model.Light

class TurnOffLightCommand(private val light: Light) : Command {
    override fun execute() {
        light.turnOff()
    }
}