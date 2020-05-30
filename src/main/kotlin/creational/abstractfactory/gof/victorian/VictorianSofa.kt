package creational.abstractfactory.gof.victorian

import creational.abstractfactory.gof.Sofa

class VictorianSofa : Sofa {
    override fun hasLegs() {
        println("It has long legs.")
    }

    override fun hasSuspensions() {
        println("It has suspensions.")
    }
}