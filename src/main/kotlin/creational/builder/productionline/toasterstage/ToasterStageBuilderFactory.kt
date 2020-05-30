package creational.builder.productionline.toasterstage

interface ToasterStageBuilderFactory {
    companion object {
        fun create() : ToasterStageBuilder = WoodOvenToasterStageBuilder()
    }

}
