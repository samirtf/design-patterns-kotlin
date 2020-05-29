package creational.abstractfactory.basic.victorian

import creational.abstractfactory.basic.Chair

class VictorianChair : Chair {
    override fun hasLegs() {
        println("It has long legs.")
    }

    override fun sitOn() {
        println("Sitting on a Victorian chair...")
    }
}