package patterns.singleton

fun main() {
    val singleton = TheSingleton.getInstance()
    insideSomeFunction()
}

fun insideSomeFunction(){
    val singleton = TheSingleton.getInstance()
}