package creational.builder.statefulproductionline

class SimpleTestMarketingStageBuilder(private val testCounter : Int = 0) : TestMarketingStageBuilder {

    override fun testMarketing() : SimpleTestMarketingStageBuilder {
        println("Testing to market...")
        return SimpleTestMarketingStageBuilder(testCounter + 1)
    }

    override fun createCommercializationStage() : CommercializationStageBuilder {
        println("All $testCounter tests passed successfully.")
        return SimpleCommercializationStageBuilder()
    }
}