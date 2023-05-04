package types.lists.distinct

import types.lists.repeatingNumbersDummyList

fun main() {
    val distinctList = repeatingNumbersDummyList.distinct()

    println("Original result is:")
    repeatingNumbersDummyList.forEach {
        print(it)
    }

    println("\nDistinct result is:")
    distinctList.forEach {
        print(it)
    }
}