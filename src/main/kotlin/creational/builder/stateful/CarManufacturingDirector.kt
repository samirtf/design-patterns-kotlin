package creational.builder.stateful

class CarManufacturingDirector {

    fun constructBasicCar(builder: BasicCarBuilder) {
        builder.withEngine(FourCylindersEngine())
                .withSoundSystem(BasicSoundSystem())
                .withWheelsKit(CheapWheelsKit())
    }

    fun constructSportCar(builder: SportCarBuilder) {
        builder.withEngine(EightCylindersEngine())
                .withWheelsKit(FancyWheelsKit())
                .withSoundSystem(EnhancedSoundSystem())
    }
}