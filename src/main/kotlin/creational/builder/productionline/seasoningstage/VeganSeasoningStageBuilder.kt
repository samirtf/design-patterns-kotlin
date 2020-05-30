package creational.builder.productionline.seasoningstage

import creational.builder.productionline.toasterstage.ToasterStageBuilder
import creational.builder.productionline.toasterstage.ToasterStageBuilderFactory

class VeganSeasoningStageBuilder : SeasoningStageBuilder {
    private var condiment: Condiment = NoCondiment()
    private var spice: Spice = NoSpice()
    private var herb: Herb = NoHerb()

    override fun withCondiment(condiment : Condiment) {
        this.condiment = condiment
    }

    override fun withSpice(spice : Spice) {
        this.spice = spice
    }

    override fun withHerb(herb : Herb) {
        this.herb = herb
    }

    override fun build() : ToasterStageBuilder {
        println("Seasoning $condiment, $spice and $herb")
        println("Going to the Toaster Stage.")
        return ToasterStageBuilderFactory.create()
    }
}