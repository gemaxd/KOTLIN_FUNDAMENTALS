package lists.partition

import lists.numbersDummyList

fun main() {
    val (even, odd) = numbersDummyList.partition { it % 2 == 0 }

    println("Even result is:")
    even.forEach {
        println(it)
    }

    println("\nOdd result is:")
    odd.forEach {
        println(it)
    }
}