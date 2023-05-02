package lists.map

import lists.numbersDummyList

fun main() {
    val mappedList = numbersDummyList.map { it * it }

    println("Result is:")
    mappedList.forEach {
        println(it)
    }
}