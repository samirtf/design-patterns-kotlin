package creational.abstractfactory.gof.modern

import creational.abstractfactory.gof.Chair

class ModernChair : Chair {
    override fun hasLegs() {
        println("It has not legs.")
    }

    override fun sitOn() {
        println("Sitting on a Modern chair...")
    }
}