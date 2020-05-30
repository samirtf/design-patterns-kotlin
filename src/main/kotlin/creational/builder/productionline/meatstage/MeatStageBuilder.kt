package creational.builder.productionline.meatstage

import creational.builder.productionline.assemblystage.AssemblyStageBuilder

interface MeatStageBuilder {
    fun heat()
    fun build() : AssemblyStageBuilder
}