package patterns.adapter.model

import patterns.adapter.interfaces.AdvancedShape

class Rectangle(private val width: Int, private val height: Int) : AdvancedShape {
    override fun rotate(degrees: Int) {
        println("Rotacionando retângulo em $degrees graus")
    }

    override fun translate(x: Int, y: Int) {
        println("Movendo retângulo para ($x, $y)")
    }

    fun drawRectangle() {
        println("Desenhando retângulo de largura $width e altura $height")
    }
}