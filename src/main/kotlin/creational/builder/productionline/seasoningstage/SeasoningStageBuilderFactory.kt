package creational.builder.productionline.seasoningstage

interface SeasoningStageBuilderFactory {
    companion object {
        fun create() : SeasoningStageBuilder = VeganSeasoningStageBuilder()
    }

}
