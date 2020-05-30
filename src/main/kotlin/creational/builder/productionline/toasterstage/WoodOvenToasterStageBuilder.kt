package creational.builder.productionline.toasterstage

import creational.builder.productionline.meatstage.MeatStageBuilder
import creational.builder.productionline.meatstage.MeatStageBuilderFactory

class WoodOvenToasterStageBuilder() : ToasterStageBuilder {
    override fun toast() {
        println("Toasting using a wood oven toaster...")
    }
    override fun build() : MeatStageBuilder {
        println("Going to the Meat Stage.")
        return MeatStageBuilderFactory.create()
    }
}