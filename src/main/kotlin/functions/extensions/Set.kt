package functions.extensions

fun <T : Comparable<T>> Set<T>.min(): T? {
    return this.min()
}

fun <T : Comparable<T>> Set<T>.max(): T? {
    return this.max()
}

fun <T> Set<T>.isSubsetOf(other: Set<T>): Boolean {
    return other.containsAll(this)
}

fun <T> Set<T>.toList(): List<T> {
    return this.toList()
}

fun <T> MutableSet<T>.removeItem(item: T): Boolean {
    return this.remove(item)
}