package creational.builder.basic.carcomponent

import creational.builder.basic.Transmission

class TruckTransmission : Transmission {

    override fun getGears(): String {
        val gears = "6"
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