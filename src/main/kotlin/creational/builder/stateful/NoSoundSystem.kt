package creational.builder.stateful 

class NoSoundSystem : SoundSystem {
    override fun hasSpeakers() {
        println("It has no sound system. So no speakers too.")
    }

    override fun hasSubwoofer() {
        println("It has no sound system. So no subwoofer too.")
    }

}