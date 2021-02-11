package com.example.hrybkov_l23.structural_patterns

interface Currency {
    var quantity: Double
}

class Dollar(override var quantity: Double) : Currency

class Euro(var dollar: Dollar) : Currency {

    override var quantity: Double
        get() = convertDollarToEuro(dollar.quantity)
        set(euroCurrency) {
            dollar.quantity = convertEuroToDollar(euroCurrency)
        }

    private fun convertDollarToEuro(numberOfDollars: Double) : Double = numberOfDollars * 0.83

    private fun convertEuroToDollar(numberOfEuro: Double) : Double = numberOfEuro * 1.2
}

fun main() {
    val dollar = Dollar(50.15)
    val euro = Euro(dollar)

    dollar.quantity = 454.35
    println(String.format("%.2f dollars is %.2f euro", dollar.quantity, euro.quantity))
}