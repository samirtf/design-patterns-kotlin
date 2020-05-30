package creational.builder.stateful

class NoCondiment : Condiment {
    override fun getTaste() {
        println("No Condiment added.")
    }

    override fun toString(): String {
        return "without condiment"
    }
}
