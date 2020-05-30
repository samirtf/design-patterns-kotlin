package creational.builder.productionline.meatstage

import creational.builder.productionline.assemblystage.AssemblyStageBuilder
import creational.builder.productionline.assemblystage.AssemblyStageBuilderFactory

class VeganMeatStageBuilder : MeatStageBuilder {
    override fun heat() {
        println("Heating meat.")
    }
    override fun build() : AssemblyStageBuilder {
        println("Going to the Assembly State.")
        return AssemblyStageBuilderFactory.create()
    }
}