package creational.builder.stateful

class BasicCar(val engine: Engine, val wheelsKit: WheelsKit, val soundSystem: SoundSystem) : Car {
    override fun run() {
        println("Running in a basic car.")
        engine.hasCylinders()
        wheelsKit.hasMaterials()
        soundSystem.hasSpeakers()
        soundSystem.hasSubwoofer()
    }
}