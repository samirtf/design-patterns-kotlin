package creational.builder.statefulproductionline

class SimpleCommercializationStageBuilder(private val negociationsCounter: Int = 0) : CommercializationStageBuilder {

    override fun negociate() : SimpleCommercializationStageBuilder {
        println("Dealing...")
        return SimpleCommercializationStageBuilder(negociationsCounter + 1)
    }

    override fun createIntroductionStage() : IntroductionStageBuilder {
        println("All $negociationsCounter negociations done successfully.")
        return SimpleIntroductionStageBuilder()
    }
}