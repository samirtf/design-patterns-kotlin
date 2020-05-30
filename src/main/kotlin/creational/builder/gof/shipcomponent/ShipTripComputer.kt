package creational.builder.gof.shipcomponent

import creational.builder.gof.TripComputer

class ShipTripComputer : TripComputer {
    override fun record() {
        println("Recording trip by ship...")
    }

    override fun calculateDistanceTraveller() {
        println("Calculating distance travelled...")
    }

    override fun calculateAverageSpeed() {
        println("Calculating average speed...")
    }

    override fun displayDistanceTravelled() {
        println("Displaying distance travelled...")
    }
}