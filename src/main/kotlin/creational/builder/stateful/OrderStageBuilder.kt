package creational.builder.stateful

interface OrderStageBuilder {
    fun register()
    fun build() : SeasoningStageBuilder
}