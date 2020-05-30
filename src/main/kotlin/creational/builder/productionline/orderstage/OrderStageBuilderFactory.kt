package creational.builder.productionline.orderstage

interface OrderStageBuilderFactory {
    companion object {
        fun create() : OrderStageBuilder = InPersonOrderBuilder()
    }

}
