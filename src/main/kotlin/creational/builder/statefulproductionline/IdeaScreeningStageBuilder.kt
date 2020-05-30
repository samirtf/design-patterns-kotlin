package creational.builder.statefulproductionline

interface IdeaScreeningStageBuilder {
    fun evaluate() : IdeaScreeningStageBuilder
    fun createConceptDevelopmentStage() : ConceptDevelopmentStageBuilder
}