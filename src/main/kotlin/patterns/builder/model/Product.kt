package patterns.builder.model

class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String
) {
    override fun toString(): String {
        return "Product(id=$id, name='$name', price=$price, description='$description')"
    }
}
