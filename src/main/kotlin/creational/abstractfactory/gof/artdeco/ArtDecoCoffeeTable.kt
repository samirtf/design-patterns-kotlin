package creational.abstractfactory.gof.artdeco

import creational.abstractfactory.gof.CoffeeTable

class ArtDecoCoffeeTable : CoffeeTable {
    override fun hasLegs() {
        println("It has legs.")
    }

    override fun hasDrawers() {
        println("It has no drawer.")
    }
}