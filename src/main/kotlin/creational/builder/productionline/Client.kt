package creational.builder.productionline

import creational.builder.productionline.orderstage.OrderStageBuilderFactory

fun main() {
    val client = Client()
    client.requestBurguer()
}

class Client {
    fun requestBurguer() {
        val director = DijkstraBurguerProductionLineDirector()
        val orderStageBuilder = OrderStageBuilderFactory.create()
        director.constructOrderStage(orderStageBuilder)

        val seasoningStageBuilder = orderStageBuilder.build()
        director.constructSeasoningStage(seasoningStageBuilder)

        val toasterStageBuilder = seasoningStageBuilder.build()
        director.constructToasterStage(toasterStageBuilder)

        val meatStageBuilder = toasterStageBuilder.build()
        director.constructMeatStage(meatStageBuilder)

        val assemblyStageBuilder = meatStageBuilder.build()
        director.constructAssemblyStage(assemblyStageBuilder)

        val packingStageBuilder = assemblyStageBuilder.build()
        director.constructPackingStage(packingStageBuilder)

        val finalStageBuilder = packingStageBuilder.build()
        director.constructFinalStage(finalStageBuilder)

        val burguer = finalStageBuilder.build()
        burguer.getDescription()
    }
}