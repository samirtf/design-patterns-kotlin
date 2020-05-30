package creational.abstractfactory.gof.modern

import creational.abstractfactory.gof.Chair
import creational.abstractfactory.gof.CoffeeTable
import creational.abstractfactory.gof.FurnitureFactory
import creational.abstractfactory.gof.Sofa

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