package patterns.builder.model

class ProductBuilder {
    var id: Int = 0
    var name: String = ""
    var price: Double = 0.0
    var description: String = ""

    fun setId(id: Int): ProductBuilder {
        this.id = id
        return this
    }

    fun setName(name: String): ProductBuilder {
        this.name = name
        return this
    }

    fun setPrice(price: Double): ProductBuilder {
        this.price = price
        return this
    }

    fun setDescription(description: String): ProductBuilder {
        this.description = description
        return this
    }

    fun build(): Product {
        return Product(id, name, price, description)
    }
}