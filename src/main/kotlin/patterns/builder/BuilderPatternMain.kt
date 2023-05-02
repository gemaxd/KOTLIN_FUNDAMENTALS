package patterns.builder

import patterns.builder.model.ProductBuilder

fun main() {
    val product = ProductBuilder()
        .setId(30)
        .setDescription("Very heavy product")
        .setName("Bowling ball")
        .build()

    println(product.toString())
}