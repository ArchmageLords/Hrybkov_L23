package com.example.hrybkov_l23.behavioral_patterns

data class Product(val name: String)

interface Command {
    fun execute(product: Product)
}

class AddProduct : Command {
    override fun execute(product: Product) {
        println("Add new product: " + product.name)
    }
}

class DeleteProduct : Command {
    override fun execute(product: Product) {
        println("Deleted product: " + product.name)
    }
}

fun main() {
    val product1 = Product("Computer")
    val addProduct = AddProduct()
    val deleteProduct = DeleteProduct()

    addProduct.execute(product1)
    deleteProduct.execute(product1)
}
