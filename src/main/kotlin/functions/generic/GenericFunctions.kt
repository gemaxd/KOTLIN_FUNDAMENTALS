package functions.generic

fun <T> reverseList(list: List<T>): List<T> {
    val result = mutableListOf<T>()
    for (i in list.indices) {
        result.add(list[list.size - i - 1])
    }
    return result
}

fun <T : Comparable<T>> maxElement(list: List<T>): T? {
    if (list.isEmpty()) {
        return null
    }
    var max = list[0]
    for (i in 1 until list.size) {
        if (list[i] > max) {
            max = list[i]
        }
    }
    return max
}

fun <T> containsElement(list: List<T>, element: T): Boolean {
    for (e in list) {
        if (e == element) {
            return true
        }
    }
    return false
}

fun <T> filterList(list: List<T>, predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (e in list) {
        if (predicate(e)) {
            result.add(e)
        }
    }
    return result
}