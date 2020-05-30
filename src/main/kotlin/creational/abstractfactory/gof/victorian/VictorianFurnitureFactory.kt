package creational.abstractfactory.gof.victorian

import creational.abstractfactory.gof.Chair
import creational.abstractfactory.gof.CoffeeTable
import creational.abstractfactory.gof.FurnitureFactory
import creational.abstractfactory.gof.Sofa

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