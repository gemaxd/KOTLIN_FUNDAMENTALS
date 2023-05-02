package patterns.iterator.implementations

class BasicIterator<T>(private val items: Array<T>) : Iterator<T> {
    private var position = 0

    override fun hasNext() = position < items.size
    override fun next(): T {
        if (!hasNext()) {
            throw NoSuchElementException()
        }
        return items[position++]
    }
}