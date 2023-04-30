package patterns.singleton

fun main() {

    val singleton = TheSingleton.getInstance()
    val singleton2 = TheSingleton.getInstance()

    insideSomeFunction()
}

fun insideSomeFunction(){
    val singleton = TheSingleton.getInstance()
}