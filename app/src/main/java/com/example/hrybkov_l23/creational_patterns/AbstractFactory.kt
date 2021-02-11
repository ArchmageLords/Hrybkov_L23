package com.example.hrybkov_l23.creational_patterns

interface ShipFactory {
    fun createShip(): Ship
}

class PassengerShipFactory : ShipFactory {
    override fun createShip(): Ship {
        return PassengerShip()
    }
}

class  IndustrialShipFactory : ShipFactory {
    override fun createShip(): Ship {
        return  IndustrialShip()
    }
}

interface Ship {
    fun showShipInfo()
}

class PassengerShip() : Ship {
    override fun showShipInfo() {
        println("Passenger ship")
    }
}

class IndustrialShip : Ship {
    override fun showShipInfo() {
        println("Industrial ship")
    }
}

fun main() {
    val passengerShipFactory = PassengerShipFactory()
    val industrialShipFactory = IndustrialShipFactory()

    val passengerShip = passengerShipFactory.createShip()
    val industrialShip = industrialShipFactory.createShip()

    passengerShip.showShipInfo()
    industrialShip.showShipInfo()
    println()
}