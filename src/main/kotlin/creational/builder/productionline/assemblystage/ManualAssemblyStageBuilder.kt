package creational.builder.productionline.assemblystage

import creational.builder.productionline.packingstage.PackingStageBuilder
import creational.builder.productionline.packingstage.PackingStageBuilderFactory

class ManualAssemblyStageBuilder : AssemblyStageBuilder {

    override fun assembly() {
        println("Assembly burguer manually.")
    }

    override fun build(): PackingStageBuilder {
        println("Going to the Packing Stage.")
        return PackingStageBuilderFactory.create()
    }
}