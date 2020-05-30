package creational.abstractfactory.gof.victorian

import creational.abstractfactory.gof.CoffeeTable

class VictorianCoffeeTable : CoffeeTable {
    override fun hasLegs() {
        println("It has legs.")
    }

    override fun hasDrawers() {
        println("It has one long drawer.")
    }
}