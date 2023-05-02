package patterns.decorator

import patterns.decorator.model.BasicIceCream
import patterns.decorator.model.decorations.ChocolateIceCreamDecorator
import patterns.decorator.model.decorations.StrawberryIceCreamDecorator

fun main() {
    val basicIceCream = BasicIceCream()
    val chocolateIceCream = ChocolateIceCreamDecorator(basicIceCream)
    val strawberryChocolateIceCream = StrawberryIceCreamDecorator(chocolateIceCream)

    println("Sorvete básico: ${basicIceCream.getDescription()} - ${basicIceCream.getCost()} reais")
    println("Sorvete com cobertura de chocolate: ${chocolateIceCream.getDescription()} - ${chocolateIceCream.getCost()} reais")
    println("Sorvete com cobertura de chocolate e morango: ${strawberryChocolateIceCream.getDescription()} - ${strawberryChocolateIceCream.getCost()} reais")
}