package creational.abstractfactory.basic

interface FurnitureFactory {
    fun createChair() : Chair
    fun createSofa() : Sofa
    fun createCoffeeTable() : CoffeeTable
}