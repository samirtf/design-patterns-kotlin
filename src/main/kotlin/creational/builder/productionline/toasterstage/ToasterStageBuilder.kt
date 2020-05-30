package creational.builder.productionline.toasterstage

import creational.builder.productionline.meatstage.MeatStageBuilder

interface ToasterStageBuilder {
    fun toast()
    fun build() : MeatStageBuilder
}