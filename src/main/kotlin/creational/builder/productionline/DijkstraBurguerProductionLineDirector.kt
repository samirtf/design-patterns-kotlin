package creational.builder.productionline

import creational.builder.productionline.assemblystage.AssemblyStageBuilder
import creational.builder.productionline.finalstage.FinalStageBuilder
import creational.builder.productionline.meatstage.MeatStageBuilder
import creational.builder.productionline.orderstage.OrderStageBuilder
import creational.builder.productionline.packingstage.PackingStageBuilder
import creational.builder.productionline.seasoningstage.NoCondiment
import creational.builder.productionline.seasoningstage.NoHerb
import creational.builder.productionline.seasoningstage.NoSpice
import creational.builder.productionline.seasoningstage.SeasoningStageBuilder
import creational.builder.productionline.toasterstage.ToasterStageBuilder

class DijkstraBurguerProductionLineDirector {

    fun constructOrderStage(builder: OrderStageBuilder) {
        builder.register()
    }

    fun constructSeasoningStage(builder: SeasoningStageBuilder) {
        builder.withCondiment(NoCondiment())
        builder.withSpice(NoSpice())
        builder.withHerb(NoHerb())
    }

    fun constructToasterStage(builder: ToasterStageBuilder) {
        builder.toast()
    }

    fun constructMeatStage(builder: MeatStageBuilder) {
        builder.heat()
    }

    fun constructAssemblyStage(builder: AssemblyStageBuilder) {
        builder.assembly()
    }

    fun constructPackingStage(builder: PackingStageBuilder) {
        builder.pack()
    }

    fun constructFinalStage(builder: FinalStageBuilder) {
        builder.check()
    }

}