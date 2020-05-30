package creational.builder.statefulproductionline

class SpokenIdea(val idea: String) : Idea {
    override fun getDescription() {
        println("Voice: $idea")
    }
}