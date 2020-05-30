package creational.builder.productionline.packingstage

import creational.builder.productionline.finalstage.FinalStageBuilder

interface PackingStageBuilder {
    fun pack()
    fun build() : FinalStageBuilder
}