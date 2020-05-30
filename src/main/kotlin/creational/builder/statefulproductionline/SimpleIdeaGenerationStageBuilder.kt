package creational.builder.statefulproductionline

class SimpleIdeaGenerationStageBuilder : IdeaGenerationStageBuilder {
    private val ideaList : MutableList<Idea> = mutableListOf()
    override fun createIdea(idea: Idea): IdeaGenerationStageBuilder {
        println("Creating an ideia...")
        ideaList.add(idea)
        return this
    }

    override fun createIdeaScreeningStage(): IdeaScreeningStageBuilder {
        println("All ${ideaList.size} ideas created successfully.")
        return SimpleIdeaScreeningStageBuilder()
    }
}