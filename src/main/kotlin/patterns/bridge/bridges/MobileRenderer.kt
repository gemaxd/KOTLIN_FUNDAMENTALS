package patterns.bridge.bridges

import patterns.bridge.interfaces.Renderer

class MobileRenderer : Renderer {
    override fun renderCircle() {
        println("Desenhando círculo no aplicativo móvel")
    }
}