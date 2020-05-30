package creational.builder.statefulproductionline

interface ConceptDevelopmentStageBuilder {
    fun develop() : ConceptDevelopmentStageBuilder
    fun createConceptTestingStage() : ConceptTestingStageBuilder
}