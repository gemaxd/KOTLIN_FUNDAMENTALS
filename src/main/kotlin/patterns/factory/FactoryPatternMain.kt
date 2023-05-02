package patterns.factory

import patterns.factory.utils.ProductFactory
import patterns.factory.utils.ProductType

fun main() {
    val product = ProductFactory.createProduct(ProductType.FIRST_PRODUCT)
    product.doSomething()
}