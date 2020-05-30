package creational.builder.gof

import creational.builder.gof.carcomponent.TruckGPSNavigator
import creational.builder.gof.carcomponent.TruckPropeller
import creational.builder.gof.carcomponent.TruckTransmission
import creational.builder.gof.carcomponent.TruckTripComputer
import creational.builder.gof.shipcomponent.ShipGPSNavigator
import creational.builder.gof.shipcomponent.ShipPropeller
import creational.builder.gof.shipcomponent.ShipTransmission
import creational.builder.gof.shipcomponent.ShipTripComputer

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