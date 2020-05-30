package creational.builder.productionline.orderstage

import creational.builder.productionline.seasoningstage.SeasoningStageBuilder

interface OrderStageBuilder {
    fun register()
    fun build() : SeasoningStageBuilder
}