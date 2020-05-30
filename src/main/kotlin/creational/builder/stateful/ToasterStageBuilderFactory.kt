package creational.builder.stateful

interface ToasterStageBuilderFactory {
    companion object {
        fun create() : ToasterStageBuilder = WoodOvenToasterStageBuilder()
    }

}
