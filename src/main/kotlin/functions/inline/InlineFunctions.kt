package functions.inline

inline fun measureTime(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - start
}

inline fun <reified T> createArray(size: Int): Array<T> = Array(size) { T::class.java.newInstance() }

inline fun <reified T> filterList(list: List<T>, crossinline predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (e in list) {
        if (predicate(e)) {
            result.add(e)
        }
    }
    return result
}

