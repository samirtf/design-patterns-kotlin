package creational.builder.stateful

class InPersonOrderBuilder : OrderStageBuilder {
    override fun register() {
        println("Registering in-person order...")
    }

    override fun build(): SeasoningStageBuilder {
        println("Building In-Person Order...")
        println("Going to the Seasoning Stage.")
        return SeasoningStageBuilderFactory.create()
    }
}