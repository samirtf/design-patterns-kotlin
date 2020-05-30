package creational.builder.stateful 

class EnhancedSoundSystem : SoundSystem {
    override fun hasSpeakers() {
        println("It has four speakers.")
    }

    override fun hasSubwoofer() {
        println("It has one subwoofer.")
    }

}