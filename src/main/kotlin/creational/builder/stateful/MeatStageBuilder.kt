package creational.builder.stateful

interface MeatStageBuilder {
    fun heat()
    fun build() : AssemblyStageBuilder
}