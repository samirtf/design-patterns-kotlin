package creational.builder.stateful

interface OrderStageBuilderFactory {
    companion object {
        fun create() : OrderStageBuilder = InPersonOrderBuilder()
    }

}
