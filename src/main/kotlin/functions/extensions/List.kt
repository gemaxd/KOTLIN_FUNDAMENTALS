package functions.extensions

import java.util.*

fun <T> List<T>.findFirst(predicate: (T) -> Boolean): T? {
    for (element in this) {
        if (predicate(element)) {
            return element
        }
    }
    return null
}

fun <T> List<T>.shuffle(): List<T> {
    val list = this.toMutableList()
    list.shuffle()
    return list
}

fun <T> List<T>.toSet(): Set<T> {
    return this.toHashSet()
}

fun <T> MutableList<T>.removeAt(index: Int): T {
    return this.removeAt(index)
}

fun <T> List<T>.countOccurrences(item: T): Int {
    return this.count { it == item }
}