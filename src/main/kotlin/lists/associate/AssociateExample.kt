package lists.associate

import lists.fruitsDummyList
import lists.peopleDummyList

fun main() {
    associateWith()
    associateBy()
}

fun associateWith(){
    val map = fruitsDummyList.associateWith { it.length }

    println("\nResult is:")

    map.forEach {
        println(it)
    }
}

fun associateBy(){
    val map = peopleDummyList.associateBy { it.name }

    println("\nOriginal result is:")

    peopleDummyList.forEach {
        println(it)
    }

    println("\nAssociated result is:")

    map.forEach {
        println(it)
    }
}
