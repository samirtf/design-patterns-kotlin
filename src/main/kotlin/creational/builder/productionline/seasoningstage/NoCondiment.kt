package creational.builder.productionline.seasoningstage

class NoCondiment : Condiment {
    override fun getTaste() {
        println("No Condiment added.")
    }

    override fun toString(): String {
        return "without condiment"
    }
}
