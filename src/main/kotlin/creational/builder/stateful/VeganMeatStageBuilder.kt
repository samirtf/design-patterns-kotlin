package creational.builder.stateful

class VeganMeatStageBuilder : MeatStageBuilder {
    override fun heat() {
        println("Heating meat.")
    }
    override fun build() : AssemblyStageBuilder {
        println("Going to the Assembly State.")
        return AssemblyStageBuilderFactory.create()
    }
}