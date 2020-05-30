package creational.builder.basic.shipcomponent
import creational.builder.basic.GPSNavigator

class ShipGPSNavigator : GPSNavigator {
    override fun showRoute() {
        println("Show routing from A to B")
    }

    override fun track() {
        println("Tracking course...")
    }

    override fun addWaypoint() {
        println("Adding a waypoint.")
    }
}