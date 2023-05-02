package patterns.iterator.model

data class Fruit(
    val type: FruitType,
    val name: String
){
    override fun toString(): String {
        return "${this.name} is a ${this.type.name} fruit"
    }
}