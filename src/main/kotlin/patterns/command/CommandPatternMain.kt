package patterns.command

import patterns.command.commands.TurnOffLightCommand
import patterns.command.commands.TurnOnLightCommand
import patterns.command.model.Light
import patterns.command.switches.Switch

fun main() {
    val light = Light()
    val turnOnCommand = TurnOnLightCommand(light)
    val turnOffCommand = TurnOffLightCommand(light)
    val switch = Switch(turnOnCommand, turnOffCommand)

    switch.turnOn()
    switch.turnOff()
}