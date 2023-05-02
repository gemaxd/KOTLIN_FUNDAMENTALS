package patterns.iterator

import patterns.iterator.implementations.BasicCollection
import patterns.iterator.model.Fruit
import patterns.iterator.model.FruitType

fun main() {
    val fruits = arrayOf(
        Fruit(type = FruitType.CITRIC, name = "Tangerine"),
        Fruit(type = FruitType.SWEET, name = "Grape"),
        Fruit(type = FruitType.BITTER, name = "Kiwi"),
        Fruit(type = FruitType.DRY, name = "Plum"),
    )
    val collection = BasicCollection(fruits)
    val iterator = collection.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}