package creational.builder.statefulproductionline

class TextualIdea(val idea: String) : Idea {
    override fun getDescription() {
        println("Text: $idea")
    }
}