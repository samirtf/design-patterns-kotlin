package creational.builder.productionline.finalstage

import creational.builder.productionline.Burguer
import creational.builder.productionline.DijkstraBurguer

class HighQualityValidationFinalStageBuilder() : FinalStageBuilder {
    override fun check() {
        println("Checking product in a high quality process..")
    }

    override fun build(): Burguer {
        println("Delivering a delicious burguer!")
        return DijkstraBurguer()
    }

}