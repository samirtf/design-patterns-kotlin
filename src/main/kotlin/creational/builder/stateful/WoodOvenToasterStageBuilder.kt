package creational.builder.stateful

class WoodOvenToasterStageBuilder() : ToasterStageBuilder {
    override fun toast() {
        println("Toasting using a wood oven toaster...")
    }
    override fun build() : MeatStageBuilder {
        println("Going to the Meat Stage.")
        return MeatStageBuilderFactory.create()
    }
}