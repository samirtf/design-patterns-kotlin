package creational.builder.gof.carcomponent

import creational.builder.gof.Propeller

class TruckPropeller : Propeller {
    private val mileage : Int = java.security.SecureRandom().nextInt()
    override fun getMileage(): Int {
        println("Mileage: $mileage")
        return mileage
    }

    override fun getSize(): String {
        TODO("Not yet implemented")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}