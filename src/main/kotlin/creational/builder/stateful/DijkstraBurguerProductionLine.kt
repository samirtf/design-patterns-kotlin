package creational.builder.stateful

class DijkstraBurguerProductionLine {
    fun main(args: Array<String>) {
        val orderStageBuilder = OrderStageBuilderFactory.create()
        orderStageBuilder.register()
        val seasoningStageBuilder = orderStageBuilder.build()
        seasoningStageBuilder.withCondiment(NoCondiment())
        seasoningStageBuilder.withSpice(NoSpice())
        seasoningStageBuilder.withHerb(NoHerb())
        val toasterStageBuilder = seasoningStageBuilder.build()
        toasterStageBuilder.toast()
        val meatStageBuilder = toasterStageBuilder.build()
        meatStageBuilder.heat()
        val assemblyStageBuilder = meatStageBuilder.build()
        assemblyStageBuilder.assembly()
        val packingStageBuilder = assemblyStageBuilder.build()
        packingStageBuilder.pack()
        val finalStageBuilder = packingStageBuilder.build()
        finalStageBuilder.check()
        val burguer = finalStageBuilder.build()
        burguer.getDescription()
    }

    fun shortWay(args: Array<String>) {
        val orderStageBuilder = OrderStageBuilderFactory.create()
        orderStageBuilder.register()
        val seasoningStageBuilder = orderStageBuilder.build()
        seasoningStageBuilder.withCondiment(NoCondiment())
        seasoningStageBuilder.withSpice(NoSpice())
        seasoningStageBuilder.withHerb(NoHerb())
        val toasterStageBuilder = seasoningStageBuilder.build()
        toasterStageBuilder.toast()
        val meatStageBuilder = toasterStageBuilder.build()
        meatStageBuilder.heat()
        val assemblyStageBuilder = meatStageBuilder.build()
        assemblyStageBuilder.assembly()
        val packingStageBuilder = assemblyStageBuilder.build()
        packingStageBuilder.pack()
        val finalStageBuilder = packingStageBuilder.build()
        finalStageBuilder.check()
        val burguer = finalStageBuilder.build()
        burguer.getDescription()
    }
}