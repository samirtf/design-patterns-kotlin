package creational.builder.statefulproductionline

interface ConceptTestingStageBuilder {
    fun test() : ConceptTestingStageBuilder
    fun createBusinessStrategyDevelopmentStage() : BusinessStrategyDevelopmentStageBuilder
}