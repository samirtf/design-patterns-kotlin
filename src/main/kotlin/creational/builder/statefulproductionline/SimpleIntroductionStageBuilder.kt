package creational.builder.statefulproductionline

class SimpleIntroductionStageBuilder : IntroductionStageBuilder {
    override fun launchToProduction() : Product {
        return SimpleProduct()
    }
}