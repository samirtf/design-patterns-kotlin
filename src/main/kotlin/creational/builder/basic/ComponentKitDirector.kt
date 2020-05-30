package creational.builder.basic

import creational.builder.basic.carcomponent.TruckGPSNavigator
import creational.builder.basic.carcomponent.TruckPropeller
import creational.builder.basic.carcomponent.TruckTransmission
import creational.builder.basic.carcomponent.TruckTripComputer
import creational.builder.basic.shipcomponent.ShipGPSNavigator
import creational.builder.basic.shipcomponent.ShipPropeller
import creational.builder.basic.shipcomponent.ShipTransmission
import creational.builder.basic.shipcomponent.ShipTripComputer

class ComponentKitDirector {

    fun constructShipComponentKit(builder : TransportComponentKitBuilder) {
        builder.withPropeller(ShipPropeller())
        builder.withTransmission(ShipTransmission())
        builder.withTripComputer(ShipTripComputer())
        builder.withGPSNavigator(ShipGPSNavigator())
    }

    fun constructTruckComponentKit(builder : TransportComponentKitBuilder) {
        builder.withPropeller(TruckPropeller())
        builder.withTransmission(TruckTransmission())
        builder.withTripComputer(TruckTripComputer())
        builder.withGPSNavigator(TruckGPSNavigator())
    }

}