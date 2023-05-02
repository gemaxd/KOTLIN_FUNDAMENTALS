package patterns.decorator.model.decorations

import patterns.decorator.decorator.IceCreamDecorator
import patterns.decorator.interfaces.IceCream

class StrawberryIceCreamDecorator(iceCream: IceCream) : IceCreamDecorator(iceCream) {
    override fun getDescription() : String {
        return "${super.getDescription()} com cobertura de morango"
    }

    override fun getCost() : Double {
        return super.getCost() + 0.75
    }
}