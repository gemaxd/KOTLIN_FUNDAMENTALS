package types.lists.sort

import types.lists.fruitsDummyList
import types.lists.peopleDummyList
import types.lists.shuffledNumbersDummyList

fun main() {
    sortedNumbers()
    println("\n")
    sortedString()
    println("\n")
    sortedObjects()
}

fun sortedNumbers(){
    val sortedNumbers = shuffledNumbersDummyList.sorted()
    val sortedDescNumbers = shuffledNumbersDummyList.sortedDescending()

    print("Original result is:")

    shuffledNumbersDummyList.forEach {
        print(" $it ")
    }
    println()
    print("Sorted result is:")

    sortedNumbers.forEach {
        print(" $it ")
    }

    println()
    print("Sorted Desc result is:")

    sortedDescNumbers.forEach {
        print(" $it ")
    }
}

fun sortedString(){
    val sortedString = fruitsDummyList.sorted()
    val sortedDescString = fruitsDummyList.sortedDescending()

    print("Original result is:")

    fruitsDummyList.forEach {
        print(" $it ")
    }
    println()
    print("Sorted result is:")

    sortedString.forEach {
        print(" $it ")
    }

    println()
    print("Sorted Desc result is:")

    sortedDescString.forEach {
        print(" $it ")
    }
}

fun sortedObjects(){
    val sortedObjectByAge = peopleDummyList.sortedBy { it.age }
    val sortedObjectByDescAge = peopleDummyList.sortedByDescending { it.age }

    print("Original result is:")

    peopleDummyList.forEach {
        print("[ ${it.name} - ${it.age} ]")
    }
    println()
    print("Sorted result is:")

    sortedObjectByAge.forEach {
        print("[ ${it.name} - ${it.age} ]")
    }

    println()
    print("Sorted Desc result is:")

    sortedObjectByDescAge.forEach {
        print("[ ${it.name} - ${it.age} ]")
    }
}