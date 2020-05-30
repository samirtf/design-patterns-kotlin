package creational.builder.productionline.assemblystage

import creational.builder.productionline.packingstage.PackingStageBuilder

interface AssemblyStageBuilder {
    fun assembly()
    fun build() : PackingStageBuilder
}