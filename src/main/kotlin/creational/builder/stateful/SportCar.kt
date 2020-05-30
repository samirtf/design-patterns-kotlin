package creational.builder.stateful

class SportCar(val engine: Engine, val wheelsKit: WheelsKit, val soundSystem: SoundSystem) : Car {
    override fun run() {
        println("Running in a sport car!")
        engine.hasCylinders()
        wheelsKit.hasMaterials()
        soundSystem.hasSpeakers()
        soundSystem.hasSubwoofer()
    }
}