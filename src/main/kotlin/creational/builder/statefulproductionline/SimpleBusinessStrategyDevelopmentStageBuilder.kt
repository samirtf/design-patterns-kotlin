package creational.builder.statefulproductionline

class SimpleBusinessStrategyDevelopmentStageBuilder(private val strategyCounter : Int = 0) : BusinessStrategyDevelopmentStageBuilder {

    override fun createBusinessStrategy() : SimpleBusinessStrategyDevelopmentStageBuilder {
        println("Creating business strategy...")
        return SimpleBusinessStrategyDevelopmentStageBuilder(strategyCounter + 1)
    }

    override fun createProductDevelopmentStage() : ProductDevelopmentStageBuilder {
        println("All $strategyCounter business strategies created successfully.")
        return SimpleProductDevelopmentStageBuilder()
    }
}