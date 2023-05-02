package patterns.bridge.model

import patterns.bridge.interfaces.Renderer

abstract class Shape(private val renderer: Renderer) {
    abstract fun draw()

    // Método de desenho que delega para o objeto Renderer
    protected fun drawImpl() = renderer.renderCircle()
}