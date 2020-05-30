package creational.builder.stateful

class EcoPaperPackingStageBuilder : PackingStageBuilder {
    override fun pack() {
        println("Packing using an eco paper packaging.")
    }

    override fun build(): FinalStageBuilder {
        println("Going to the Final Stage.")
        return FinalStageBuilderFactory.create()
    }

}
