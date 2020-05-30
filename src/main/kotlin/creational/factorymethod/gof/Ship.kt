package creational.factorymethod.gof

class Ship : Transport {
    override fun deliver() {
        print("Delivering by sea in a container...")
    }
}