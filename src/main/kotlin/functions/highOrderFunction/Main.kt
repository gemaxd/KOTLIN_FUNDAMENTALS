package functions.highOrderFunction

import functions.highOrderFunction.utils.Operation

fun main() {
    println(doOperation(2.0, 3.0, chooseOperation(Operation.ADDITION)))
}