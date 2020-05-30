package creational.builder.statefulproductionline

class SimpleIdeaScreeningStageBuilder(private val screeningCounter : Int = 0) : IdeaScreeningStageBuilder {
    override fun evaluate() : SimpleIdeaScreeningStageBuilder {
        println("Evaluating idea screnning...")
        return SimpleIdeaScreeningStageBuilder(screeningCounter + 1)
    }

    override fun createConceptDevelopmentStage() : ConceptDevelopmentStageBuilder {
        println("All $screeningCounter idea screenings developed successfully.")
        return SimpleConceptDevelopmentStageBuilder()
    }
}