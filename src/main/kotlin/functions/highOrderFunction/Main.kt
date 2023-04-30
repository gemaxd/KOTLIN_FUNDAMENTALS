package functions.highOrderFunction

import functions.highOrderFunction.chooseOperation
import functions.highOrderFunction.doOperation
import utils.Operation

fun main() {
    println(doOperation(2.0, 3.0, chooseOperation(Operation.ADDITION)))
}