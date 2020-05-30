package creational.builder.gof

interface TransportComponentKitBuilder {
    fun withPropeller(propeller: Propeller)
    fun withTransmission(transmission: Transmission)
    fun withTripComputer(tripComputer: TripComputer)
    fun withGPSNavigator(gpsNavigator: GPSNavigator)
}