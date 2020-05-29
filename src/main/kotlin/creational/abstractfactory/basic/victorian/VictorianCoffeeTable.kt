package creational.abstractfactory.basic.victorian

import creational.abstractfactory.basic.CoffeeTable

class VictorianCoffeeTable : CoffeeTable {
    override fun hasLegs() {
        println("It has legs.")
    }

    override fun hasDrawers() {
        println("It has one long drawer.")
    }
}