package creational.builder.gof.shipcomponent

import creational.builder.gof.Transmission

class ShipTransmission : Transmission {
    override fun getGears(): String {
        val gears = "3"
        println("It has $gears gears.")
        return gears
    }

    override fun shiftUp() {
        println("Shifting up a gear.")
    }

    override fun shiftDown() {
        println("Shifting down a gear.")
    }

}