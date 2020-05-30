package creational.builder.gof.shipcomponent

import creational.builder.gof.Propeller
import java.security.SecureRandom

class ShipPropeller : Propeller {
    private val mileage : Int = SecureRandom().nextInt()
    override fun getMileage(): Int {
        println("Mileage: $mileage")
        return mileage
    }

    override fun getSize(): String {
        val propellerSize = "Small propeller."
        println(propellerSize)
        return propellerSize
    }

    override fun start() {
        println("Starting ship propeller.")
    }

    override fun stop() {
        println("Stopping ship propeller.")
    }
}