package creational.builder.statefulproductionline

interface ProductDevelopmentStageBuilder {
    fun createProduct() : ProductDevelopmentStageBuilder
    fun createTestMarketingStage() : TestMarketingStageBuilder
}