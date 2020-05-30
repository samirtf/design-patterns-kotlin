package creational.abstractfactory.gof.modern

import creational.abstractfactory.gof.Sofa

class ModernSofa : Sofa {
    override fun hasLegs() {
        println("It has no legs.")
    }

    override fun hasSuspensions() {
        println("It has no suspensions.")
    }
}