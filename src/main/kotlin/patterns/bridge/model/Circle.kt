package patterns.bridge.model

import patterns.bridge.interfaces.Renderer

class Circle(
    private val x: Int,
    private val y: Int,
    private val radius: Int,
    renderer: Renderer
) : Shape(renderer) {

    override fun draw() {
        drawImpl()
    }
}