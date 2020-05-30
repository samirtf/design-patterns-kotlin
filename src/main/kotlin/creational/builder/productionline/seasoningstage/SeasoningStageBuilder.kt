package creational.builder.productionline.seasoningstage

import creational.builder.productionline.toasterstage.ToasterStageBuilder

interface SeasoningStageBuilder {
    fun withCondiment(condiment : Condiment)
    fun withSpice(spice : Spice)
    fun withHerb(herb : Herb)
    fun build() : ToasterStageBuilder
}