package patterns.bridge

import patterns.bridge.bridges.DesktopRenderer
import patterns.bridge.bridges.MobileRenderer
import patterns.bridge.model.Circle

fun main() {
    val desktopCircle = Circle(10, 20, 30, DesktopRenderer())
    desktopCircle.draw()

    val mobileCircle = Circle(10, 20, 30, MobileRenderer())
    mobileCircle.draw()
}