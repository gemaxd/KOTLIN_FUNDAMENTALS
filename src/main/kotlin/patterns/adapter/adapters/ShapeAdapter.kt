package patterns.adapter.adapters

import patterns.adapter.interfaces.Shape
import patterns.adapter.model.Rectangle

class ShapeAdapter(private val rectangle: Rectangle) : Shape {
    override fun draw() {
        rectangle.drawRectangle()
    }
}