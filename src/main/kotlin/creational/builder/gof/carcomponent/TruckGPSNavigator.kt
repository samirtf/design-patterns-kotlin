package creational.builder.gof.carcomponent

import creational.builder.gof.GPSNavigator

class TruckGPSNavigator : GPSNavigator {
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