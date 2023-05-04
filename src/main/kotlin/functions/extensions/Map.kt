package functions.extensions

fun <K, V> Map<K, V>.getOrElse(key: K, defaultValue: V): V {
    return this.getOrDefault(key, defaultValue)
}

fun <K, V> Map<K, V>.containsKey(key: K): Boolean {
    return this.containsKey(key)
}

fun <K, V> Map<K, V>.containsValue(value: V): Boolean {
    return this.containsValue(value)
}

fun <K, V> MutableMap<K, V>.putOrReplace(key: K, value: V): V? {
    return this.put(key, value)
}