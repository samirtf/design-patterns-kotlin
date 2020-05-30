package creational.builder.statefulproductionline

class SimpleConceptDevelopmentStageBuilder(private val conceptCounter : Int = 0) : ConceptDevelopmentStageBuilder {
    override fun develop() : SimpleConceptDevelopmentStageBuilder {
        println("Developing a concept...")
        return SimpleConceptDevelopmentStageBuilder(conceptCounter + 1)
    }
    override fun createConceptTestingStage() : ConceptTestingStageBuilder {
        println("All $conceptCounter concepts developed successfully.")
        return SimpleConceptTestingStageBuilder()
    }
}