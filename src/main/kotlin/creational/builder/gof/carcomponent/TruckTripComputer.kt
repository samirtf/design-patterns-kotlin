package creational.builder.gof.carcomponent

import creational.builder.gof.TripComputer

class TruckTripComputer : TripComputer {
    override fun record() {
        println("Recording trip by truck...")
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