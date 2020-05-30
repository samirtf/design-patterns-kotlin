package creational.builder.productionline.finalstage

interface FinalStageBuilderFactory {
    companion object {
        fun create() : FinalStageBuilder = HighQualityValidationFinalStageBuilder()
    }

}
