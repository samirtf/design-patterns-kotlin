package creational.builder.stateful

interface PackingStageBuilder {
    fun pack()
    fun build() : FinalStageBuilder
}