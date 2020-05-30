package creational.builder.stateful

interface FinalStageBuilderFactory {
    companion object {
        fun create() : FinalStageBuilder = HighQualityValidationFinalStageBuilder()
    }

}
