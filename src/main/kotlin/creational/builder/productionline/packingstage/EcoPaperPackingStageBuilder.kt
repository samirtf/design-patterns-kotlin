package creational.builder.productionline.packingstage

import creational.builder.productionline.finalstage.FinalStageBuilder
import creational.builder.productionline.finalstage.FinalStageBuilderFactory

class EcoPaperPackingStageBuilder : PackingStageBuilder {
    override fun pack() {
        println("Packing using an eco paper packaging.")
    }

    override fun build(): FinalStageBuilder {
        println("Going to the Final Stage.")
        return FinalStageBuilderFactory.create()
    }

}
