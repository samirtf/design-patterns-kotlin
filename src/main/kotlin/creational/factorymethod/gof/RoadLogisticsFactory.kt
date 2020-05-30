package creational.factorymethod.gof

class RoadLogisticsFactory : LogisticsFactory {
    override fun planDelivery() {
        print("Planning a delivery by land...")
    }

    override fun createTransport(): Transport {
        return Truck()
    }
}