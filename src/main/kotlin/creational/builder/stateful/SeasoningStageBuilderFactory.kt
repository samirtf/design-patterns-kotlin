package creational.builder.stateful

interface SeasoningStageBuilderFactory {
    companion object {
        fun create() : SeasoningStageBuilder = VeganSeasoningStageBuilder()
    }

}
