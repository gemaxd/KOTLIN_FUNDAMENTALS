package lists.filter

import lists.numbersDummyList

fun main() {
    val filteredList = numbersDummyList.filter { it % 2 == 0 }

    println("Result is:")

    filteredList.forEach {
        println(it)
    }
}