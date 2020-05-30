package creational.abstractfactory.gof

interface FurnitureFactory {
    fun createChair() : Chair
    fun createSofa() : Sofa
    fun createCoffeeTable() : CoffeeTable
}