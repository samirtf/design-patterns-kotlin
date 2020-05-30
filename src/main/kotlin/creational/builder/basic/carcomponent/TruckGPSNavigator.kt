package creational.builder.basic.carcomponent

import creational.builder.basic.GPSNavigator

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