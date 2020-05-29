package creational.abstractfactory.basic.artdeco

import creational.abstractfactory.basic.Chair

class ArtDecoChair : Chair {
    override fun hasLegs() {
        println("It has short legs.")
    }

    override fun sitOn() {
        println("Sitting on an Art Deco chair...")
    }
}