package com.example.hrybkov_l23.creational_patterns

class Pizza private constructor() {

    var pizzaType: String = ""
    var size: String = ""
    var toppings: List<String> = listOf()
    var price: Double = .0

    class Builder {
        private val pizza = Pizza()

        fun setPizzaType(pizzaType: String) = apply { pizza.pizzaType = pizzaType }
        fun setSize(size: String) = apply { pizza.size = size }
        fun setToppings(toppings: List<String>) = apply { pizza.toppings = toppings }
        fun setPrice(price: Double) = apply { pizza.price = price }
        fun build() = pizza
    }
}


fun main() {
    val pizzaExample = Pizza.Builder()
    val firstPizza = pizzaExample.setPizzaType("Sicilian")
        .setSize("Large")
        .setToppings(listOf("Ketchup", "Tomatoes"))
        .setPrice(250.00)
        .build()
    println("Pizza type: ${firstPizza.pizzaType} \nSize: ${firstPizza.size}")
}