package patterns.template

fun main() {
    val game1: Game = Cricket()
    game1.play()

    val game2: Game = Football()
    game2.play()
}