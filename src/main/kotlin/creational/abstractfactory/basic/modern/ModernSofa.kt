package creational.abstractfactory.basic.modern

import creational.abstractfactory.basic.Sofa

class ModernSofa : Sofa {
    override fun hasLegs() {
        println("It has no legs.")
    }

    override fun hasSuspensions() {
        println("It has no suspensions.")
    }
}