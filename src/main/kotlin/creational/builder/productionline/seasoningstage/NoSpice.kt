package creational.builder.productionline.seasoningstage

class NoSpice : Spice {
    override fun getBlazingDegree() {
        println("It has 0 blazing degree.")
    }

    override fun toString(): String {
        return "without spice"
    }
}
