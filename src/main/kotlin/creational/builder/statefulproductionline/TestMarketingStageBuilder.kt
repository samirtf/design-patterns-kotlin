package creational.builder.statefulproductionline

interface TestMarketingStageBuilder {
    fun testMarketing() : TestMarketingStageBuilder
    fun createCommercializationStage() : CommercializationStageBuilder
}