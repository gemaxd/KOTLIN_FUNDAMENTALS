package types.lists.reduce

import types.lists.numbersDummyList

fun main() {
    sumByReduce()
    maxByReduce()
}

fun sumByReduce(){
    val sum = numbersDummyList.reduce { acc, i -> acc + i }

    println("\nSum result is:")
    println(sum)
}

fun maxByReduce(){
    val max = numbersDummyList.reduce { acc, i -> if (i > acc) i else acc }

    println("\nMaximun result is:")
    println(max)
}