package creational.builder.stateful

interface SeasoningStageBuilder {
    fun withCondiment(condiment : Condiment)
    fun withSpice(spice : Spice)
    fun withHerb(herb : Herb)
    fun build() : ToasterStageBuilder
}