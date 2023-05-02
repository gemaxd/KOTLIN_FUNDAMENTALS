package patterns.bridge.bridges

import patterns.bridge.interfaces.Renderer

class DesktopRenderer : Renderer {
    override fun renderCircle() {
        println("Desenhando círculo na janela de desktop")
    }
}