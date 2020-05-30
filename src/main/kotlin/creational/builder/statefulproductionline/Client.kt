package creational.builder.statefulproductionline

fun main(array: Array<String>) {
    val client = Client()
    client.requestInnovativeProduct()
}

class Client {
    fun requestInnovativeProduct() {
        val ideaGenerationStageBuilder = SimpleIdeaGenerationStageBuilder()
        val director = ProductCreationProcessDirector()

        val constructTextualProductCreationProcess = director.constructTextualProductCreationProcess(ideaGenerationStageBuilder)
        constructTextualProductCreationProcess.launchToProduction()
    }
}