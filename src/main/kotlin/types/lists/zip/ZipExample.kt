package types.lists.zip

import types.lists.fruitsDummyList
import types.lists.numbersDummyList

fun main() {
    val zippedList = fruitsDummyList.zip(numbersDummyList)

    println("Result is:")
    zippedList.forEach {
        println(it)
    }
}