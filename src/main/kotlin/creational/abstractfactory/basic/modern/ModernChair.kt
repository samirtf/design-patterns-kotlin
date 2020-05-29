package creational.abstractfactory.basic.modern

import creational.abstractfactory.basic.Chair

class ModernChair : Chair {
    override fun hasLegs() {
        println("It has not legs.")
    }

    override fun sitOn() {
        println("Sitting on a Modern chair...")
    }
}