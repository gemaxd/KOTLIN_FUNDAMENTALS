package patterns.iterator.implementations

class BasicCollection<T>(private val items: Array<T>) : Iterable<T> {
    override fun iterator() = BasicIterator(items)
}