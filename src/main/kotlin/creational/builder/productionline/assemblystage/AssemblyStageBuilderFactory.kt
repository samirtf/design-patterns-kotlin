package creational.builder.productionline.assemblystage

interface AssemblyStageBuilderFactory {
    companion object {
        fun create() : AssemblyStageBuilder = ManualAssemblyStageBuilder()
    }
}
