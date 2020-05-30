package creational.builder.basic

class Client {

    fun main(args: Array<String>) {
        val director = ComponentKitDirector()

        val shipComponentKitBuilder = ShipComponentKitBuilder()
        director.constructShipComponentKit(shipComponentKitBuilder)

        val shipComponentKit = shipComponentKitBuilder.build()
        println("Ship Component Kit: " + shipComponentKit.propeller)

        val truckComponentKitBuilder = TruckComponentKitBuilder()
        director.constructTruckComponentKit(truckComponentKitBuilder)


    }

}