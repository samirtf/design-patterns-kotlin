package creational.builder.statefulproductionline

class SimpleProductDevelopmentStageBuilder(private val productCreationCounter : Int = 0) : ProductDevelopmentStageBuilder {
    override fun createProduct() : SimpleProductDevelopmentStageBuilder {
        println("Creating product...")
        return SimpleProductDevelopmentStageBuilder(productCreationCounter + 1)
    }

    override fun createTestMarketingStage() : TestMarketingStageBuilder {
        println("All $productCreationCounter products created successfully.")
        return SimpleTestMarketingStageBuilder()
    }
}