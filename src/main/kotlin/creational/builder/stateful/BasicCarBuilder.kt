package creational.builder.stateful

class BasicCarBuilder : CarBuilder {
    private var engine: Engine = NoEngine()
    private var wheelsKit: WheelsKit = NoWheelsKit()
    private var soundSystem: SoundSystem = NoSoundSystem()

    override fun withEngine(engine: Engine): CarBuilder {
        this.engine = engine
        return this
    }

    override fun withWheelsKit(wheelsKit: WheelsKit): CarBuilder {
        this.wheelsKit = wheelsKit
        return this
    }

    override fun withSoundSystem(soundSystem: SoundSystem): CarBuilder {
        this.soundSystem = soundSystem
        return this
    }

    fun reset() {
        this.engine = NoEngine()
        this.wheelsKit = NoWheelsKit()
        this.soundSystem = NoSoundSystem()
    }

    fun build() : Car {
        return BasicCar(engine = this.engine, wheelsKit = this.wheelsKit, soundSystem = this.soundSystem)
    }

}