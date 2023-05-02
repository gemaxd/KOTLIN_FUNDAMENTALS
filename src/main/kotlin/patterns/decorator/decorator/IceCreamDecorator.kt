package patterns.decorator.decorator

import patterns.decorator.interfaces.IceCream

// Decorador abstrato
abstract class IceCreamDecorator(private val iceCream: IceCream) : IceCream {
    override fun getDescription() = iceCream.getDescription()
    override fun getCost() = iceCream.getCost()
}