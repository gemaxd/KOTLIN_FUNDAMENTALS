package patterns.adapter

import patterns.adapter.adapters.ShapeAdapter
import patterns.adapter.model.Rectangle

fun main() {
    val rectangle = Rectangle(10, 20)
    val adapter = ShapeAdapter(rectangle)

    adapter.draw() // Desenhando retângulo de largura 10 e altura 20
}