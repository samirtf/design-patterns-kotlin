package creational.builder.basic

class ShipComponentKitBuilder : TransportComponentKitBuilder {
    private lateinit var propeller : Propeller
    private lateinit var transmission: Transmission
    private lateinit var tripComputer: TripComputer
    private lateinit var gpsNavigator: GPSNavigator

    override fun withPropeller(propeller: Propeller) {
        this.propeller = propeller
    }

    override fun withTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun withTripComputer(tripComputer: TripComputer) {
        this.tripComputer = tripComputer
    }

    override fun withGPSNavigator(gpsNavigator: GPSNavigator) {
        this.gpsNavigator = gpsNavigator
    }

    fun build() : ShipComponentKit {
        return ShipComponentKit(propeller, transmission, tripComputer, gpsNavigator)
    }
}