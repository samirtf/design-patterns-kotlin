package creational.abstractfactory.gof.artdeco

import creational.abstractfactory.gof.Chair

class ArtDecoChair : Chair {
    override fun hasLegs() {
        println("It has short legs.")
    }

    override fun sitOn() {
        println("Sitting on an Art Deco chair...")
    }
}