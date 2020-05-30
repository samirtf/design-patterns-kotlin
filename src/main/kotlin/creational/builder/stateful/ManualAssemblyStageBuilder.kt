package creational.builder.stateful

class ManualAssemblyStageBuilder : AssemblyStageBuilder {

    override fun assembly() {
        println("Assembly burguer manually.")
    }

    override fun build(): PackingStageBuilder {
        println("Going to the Packing Stage.")
        return PackingStageBuilderFactory.create()
    }
}