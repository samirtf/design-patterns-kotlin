package creational.abstractfactory.basic.victorian

import creational.abstractfactory.basic.Chair
import creational.abstractfactory.basic.CoffeeTable
import creational.abstractfactory.basic.FurnitureFactory
import creational.abstractfactory.basic.Sofa

class VictorianFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return VictorianChair()
    }

    override fun createSofa(): Sofa {
        return VictorianSofa()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return VictorianCoffeeTable()
    }
}