package creational.builder.statefulproductionline

interface IdeaGenerationStageBuilder {
    fun createIdea(idea: Idea) : IdeaGenerationStageBuilder
    fun createIdeaScreeningStage() : IdeaScreeningStageBuilder
}