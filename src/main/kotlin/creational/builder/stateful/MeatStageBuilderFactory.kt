package creational.builder.stateful

interface MeatStageBuilderFactory {
    companion object {
        fun create() : MeatStageBuilder = VeganMeatStageBuilder()
    }
}
