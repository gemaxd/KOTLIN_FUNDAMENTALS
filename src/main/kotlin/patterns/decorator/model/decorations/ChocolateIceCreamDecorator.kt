package patterns.decorator.model.decorations

import patterns.decorator.decorator.IceCreamDecorator
import patterns.decorator.interfaces.IceCream

class ChocolateIceCreamDecorator(iceCream: IceCream) : IceCreamDecorator(iceCream) {
    override fun getDescription() : String {
        return "${super.getDescription()} com cobertura de chocolate"
    }

    override fun getCost() : Double {
        return super.getCost() + 0.5
    }
}