package creational.builder.stateful

interface AssemblyStageBuilderFactory {
    companion object {
        fun create() : AssemblyStageBuilder = ManualAssemblyStageBuilder()
    }
}
