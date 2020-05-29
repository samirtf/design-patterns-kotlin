package creational.abstractfactory.basic.artdeco

import creational.abstractfactory.basic.Sofa

class ArtDecoSofa : Sofa {
    override fun hasLegs() {
        println("It has short legs.")
    }

    override fun hasSuspensions() {
        println("No suspensions.")
    }
}