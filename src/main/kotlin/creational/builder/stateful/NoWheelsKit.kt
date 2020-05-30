package creational.builder.stateful 

class NoWheelsKit : WheelsKit {
    override fun hasMaterials() {
        println("It has no wheels kit.")
    }

}