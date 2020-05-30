package creational.builder.stateful

class NoEngine : Engine {
    override fun hasCylinders() {
        println("It has no engine.")
    }

}