package creational.factorymethod.basic

class RoadLogisticsFactory : LogisticsFactory {
    override fun planDelivery() {
        print("Planning a delivery by land...")
    }

    override fun createTransport(): Transport {
        return Truck()
    }
}