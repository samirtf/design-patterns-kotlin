package creational.builder.statefulproductionline

interface CommercializationStageBuilder {
    fun negociate() : CommercializationStageBuilder
    fun createIntroductionStage() : IntroductionStageBuilder
}