package creational.abstractfactory.gof.artdeco

import creational.abstractfactory.gof.Sofa

class ArtDecoSofa : Sofa {
    override fun hasLegs() {
        println("It has short legs.")
    }

    override fun hasSuspensions() {
        println("No suspensions.")
    }
}