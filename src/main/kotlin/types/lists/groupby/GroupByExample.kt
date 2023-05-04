package types.lists.groupby

import types.lists.peopleDummyList

fun main() {
    val peopleByAge = peopleDummyList.groupBy { it.age }

    println()
    peopleByAge.forEach {
        println(it.toString())
    }
}