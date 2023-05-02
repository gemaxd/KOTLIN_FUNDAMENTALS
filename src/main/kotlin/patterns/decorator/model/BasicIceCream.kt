package patterns.decorator.model

import patterns.decorator.interfaces.IceCream

class BasicIceCream : IceCream {
    override fun getDescription(): String {
        return "Sorvete básico"
    }
    override fun getCost() : Double {
        return 2.0
    }
}