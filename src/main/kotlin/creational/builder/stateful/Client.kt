package creational.builder.stateful

fun main(array: Array<String>) {
    val client = Client()
    client.requestCars()
}

class Client {
    fun requestCars() {
        val director = CarManufacturingDirector()

        val basicCarBuilder = BasicCarBuilder()
        director.constructBasicCar(basicCarBuilder)
        basicCarBuilder.build().run()

        val sportCarBuilder = SportCarBuilder()
        director.constructSportCar(sportCarBuilder)
        sportCarBuilder.build().run()

    }
}