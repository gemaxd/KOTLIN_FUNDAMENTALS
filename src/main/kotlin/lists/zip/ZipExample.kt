package lists.zip

import lists.fruitsDummyList
import lists.numbersDummyList

fun main() {
    val zippedList = fruitsDummyList.zip(numbersDummyList)

    println("Result is:")
    zippedList.forEach {
        println(it)
    }
}