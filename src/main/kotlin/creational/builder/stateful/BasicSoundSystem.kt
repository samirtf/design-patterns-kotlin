package creational.builder.stateful 

class BasicSoundSystem : SoundSystem {
    override fun hasSpeakers() {
        println("It has two speakers.")
    }

    override fun hasSubwoofer() {
        println("It has no subwoofer.")
    }

}