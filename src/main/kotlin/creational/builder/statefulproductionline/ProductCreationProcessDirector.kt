package creational.builder.statefulproductionline

class ProductCreationProcessDirector {

    fun constructTextualProductCreationProcess(ideaGenerationStageBuilder: IdeaGenerationStageBuilder) : IntroductionStageBuilder {
        return ideaGenerationStageBuilder
                .createIdea(TextualIdea("toy shop"))
                .createIdea(TextualIdea("fishing shop"))
                .createIdea(TextualIdea("bookstore shop"))
                .createIdeaScreeningStage()
                .evaluate()
                .evaluate()
                .evaluate()
                .createConceptDevelopmentStage()
                .develop()
                .develop()
                .develop()
                .createConceptTestingStage()
                .test()
                .test()
                .test()
                .createBusinessStrategyDevelopmentStage()
                .createBusinessStrategy()
                .createProductDevelopmentStage()
                .createProduct()
                .createProduct()
                .createProduct()
                .createTestMarketingStage()
                .testMarketing()
                .createCommercializationStage()
                .negociate()
                .negociate()
                .createIntroductionStage()
    }

}