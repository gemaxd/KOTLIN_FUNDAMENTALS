package lists.groupby

import lists.peopleDummyList

fun main() {
    val peopleByAge = peopleDummyList.groupBy { it.age }

    println()
    peopleByAge.forEach {
        println(it.toString())
    }
}