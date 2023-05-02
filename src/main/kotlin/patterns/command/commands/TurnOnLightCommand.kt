package patterns.command.commands

import patterns.command.interfaces.Command
import patterns.command.model.Light

class TurnOnLightCommand(private val light: Light) : Command {
    override fun execute() {
        light.turnOn()
    }
}