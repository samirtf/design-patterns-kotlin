package creational.builder.productionline.finalstage

import creational.builder.productionline.Burguer

interface FinalStageBuilder {
    fun check()
    fun build() : Burguer
}