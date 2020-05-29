package creational.abstractfactory.basic.artdeco

import creational.abstractfactory.basic.CoffeeTable

class ArtDecoCoffeeTable : CoffeeTable {
    override fun hasLegs() {
        println("It has legs.")
    }

    override fun hasDrawers() {
        println("It has no drawer.")
    }
}