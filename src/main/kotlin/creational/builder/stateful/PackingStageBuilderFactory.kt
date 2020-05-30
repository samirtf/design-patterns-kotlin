package creational.builder.stateful

interface PackingStageBuilderFactory {
    companion object {
        fun create() : PackingStageBuilder = EcoPaperPackingStageBuilder()
    }

}
