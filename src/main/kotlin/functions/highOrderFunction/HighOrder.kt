package functions.highOrderFunction

import utils.Operation

fun sumOperation(first: Double, second: Double): Double{
    return first + second
}

fun subtractionOperation(first: Double, second: Double): Double{
    return first - second
}

fun timesOperation(first: Double, second: Double): Double{
    return first * second
}

fun divisionOperation(first: Double, second: Double): Double {
    return first / second
}

fun doOperation(first: Double, second: Double, fn: (Double, Double) -> Double): String {
    return fn(first, second).toString()
}

fun chooseOperation(operation : Operation): (Double, Double) -> Double {
    return when(operation){
        Operation.ADDITION -> ::sumOperation
        Operation.SUBTRACTION -> ::subtractionOperation
        Operation.MULTIPLICATION -> ::timesOperation
        Operation.DIVISION -> ::divisionOperation
    }
}

