package creational.factorymethod.basic

class SeaLogisticsFactory : LogisticsFactory {
    override fun planDelivery() {
        print("Planning a delivery by sea...")
    }

    override fun createTransport(): Transport {
        return Ship()
    }
}