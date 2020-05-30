package creational.builder.statefulproductionline

interface BusinessStrategyDevelopmentStageBuilder {
    fun createBusinessStrategy() : BusinessStrategyDevelopmentStageBuilder
    fun createProductDevelopmentStage() : ProductDevelopmentStageBuilder
}