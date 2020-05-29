package creational.abstractfactory.basic.modern

import creational.abstractfactory.basic.CoffeeTable

class ModernCoffeeTable : CoffeeTable {
    override fun hasLegs() {
        println("It has no legs.")
    }

    override fun hasDrawers() {
        println("It has no drawer.")
    }
}