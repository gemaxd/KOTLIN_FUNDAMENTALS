package types.lists.flatmap

import types.lists.phraseDummyList

fun main() {
    val flattedMapList = phraseDummyList.flatMap { it.split(" ") }

    println("Original Result is:")
    println(phraseDummyList.toString())

    println("\nResult is:")
    println(flattedMapList.toString())

}