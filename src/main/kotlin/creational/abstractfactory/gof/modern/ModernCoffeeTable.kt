package creational.abstractfactory.gof.modern

import creational.abstractfactory.gof.CoffeeTable

class ModernCoffeeTable : CoffeeTable {
    override fun hasLegs() {
        println("It has no legs.")
    }

    override fun hasDrawers() {
        println("It has no drawer.")
    }
}