package creational.abstractfactory.basic.modern

import creational.abstractfactory.basic.Chair
import creational.abstractfactory.basic.CoffeeTable
import creational.abstractfactory.basic.FurnitureFactory
import creational.abstractfactory.basic.Sofa

class ModernFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createSofa(): Sofa {
        return ModernSofa()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return ModernCoffeeTable()
    }
}