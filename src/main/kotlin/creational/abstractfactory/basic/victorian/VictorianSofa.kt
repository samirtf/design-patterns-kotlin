package creational.abstractfactory.basic.victorian

import creational.abstractfactory.basic.Sofa

class VictorianSofa : Sofa {
    override fun hasLegs() {
        println("It has long legs.")
    }

    override fun hasSuspensions() {
        println("It has suspensions.")
    }
}