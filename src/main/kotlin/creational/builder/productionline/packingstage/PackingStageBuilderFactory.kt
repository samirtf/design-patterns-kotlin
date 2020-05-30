package creational.builder.productionline.packingstage

interface PackingStageBuilderFactory {
    companion object {
        fun create() : PackingStageBuilder = EcoPaperPackingStageBuilder()
    }

}
