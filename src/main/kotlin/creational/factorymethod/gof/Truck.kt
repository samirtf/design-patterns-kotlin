package creational.factorymethod.gof

class Truck : Transport {
    override fun deliver() {
        println("Delivering by land in a box....")
    }
}