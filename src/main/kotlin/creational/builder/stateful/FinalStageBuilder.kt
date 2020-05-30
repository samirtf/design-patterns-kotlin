package creational.builder.stateful

interface FinalStageBuilder {
    fun check()
    fun build() : Burguer
}