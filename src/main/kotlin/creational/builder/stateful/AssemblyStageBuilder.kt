package creational.builder.stateful

interface AssemblyStageBuilder {
    fun assembly()
    fun build() : PackingStageBuilder
}