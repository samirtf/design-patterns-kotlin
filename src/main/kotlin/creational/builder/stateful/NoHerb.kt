package creational.builder.stateful

class NoHerb : Herb {

    override fun getColor() {
        println("No color defined.")
    }

    override fun toString(): String {
        return "without herb"
    }
}
