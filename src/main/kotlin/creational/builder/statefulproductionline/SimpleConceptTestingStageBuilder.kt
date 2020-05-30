package creational.builder.statefulproductionline

class SimpleConceptTestingStageBuilder(private val conceptTestCounter : Int = 0) : ConceptTestingStageBuilder {
    override fun test() : SimpleConceptTestingStageBuilder {
        println("Testing a concept...")
        return SimpleConceptTestingStageBuilder(conceptTestCounter + 1)
    }
    override fun createBusinessStrategyDevelopmentStage() : BusinessStrategyDevelopmentStageBuilder {
        println("All $conceptTestCounter concept tests created successfully.")
        return SimpleBusinessStrategyDevelopmentStageBuilder()
    }
}