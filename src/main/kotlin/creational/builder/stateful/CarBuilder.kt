package creational.builder.stateful

interface CarBuilder {
    fun withEngine(engine: Engine) : CarBuilder
    fun withWheelsKit(wheelsKit: WheelsKit) : CarBuilder
    fun withSoundSystem(soundSystem: SoundSystem) : CarBuilder
}