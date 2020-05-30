package creational.builder.stateful

interface ToasterStageBuilder {
    fun toast()
    fun build() : MeatStageBuilder
}