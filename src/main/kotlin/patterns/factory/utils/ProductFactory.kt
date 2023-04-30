package patterns.factory.utils

import patterns.factory.model.Product
import patterns.factory.model.FirstProduct
import patterns.factory.model.SecondProduct

object ProductFactory {
    fun createProduct(type: ProductType): Product {
        return when (type) {
            ProductType.FIRST_PRODUCT -> FirstProduct()
            ProductType.SECOND_PRODUCT -> SecondProduct()
        }
    }
}