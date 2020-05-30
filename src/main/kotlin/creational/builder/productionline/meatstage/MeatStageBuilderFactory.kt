package creational.builder.productionline.meatstage

interface MeatStageBuilderFactory {
    companion object {
        fun create() : MeatStageBuilder = VeganMeatStageBuilder()
    }
}
