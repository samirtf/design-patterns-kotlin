package creational.abstractfactory.gof.victorian

import creational.abstractfactory.gof.Chair

class VictorianChair : Chair {
    override fun hasLegs() {
        println("It has long legs.")
    }

    override fun sitOn() {
        println("Sitting on a Victorian chair...")
    }
}