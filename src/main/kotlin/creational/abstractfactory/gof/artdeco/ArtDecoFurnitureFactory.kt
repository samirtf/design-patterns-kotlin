package creational.abstractfactory.gof.artdeco

import creational.abstractfactory.gof.Chair
import creational.abstractfactory.gof.CoffeeTable
import creational.abstractfactory.gof.FurnitureFactory
import creational.abstractfactory.gof.Sofa

class ArtDecoFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return ArtDecoChair()
    }

    override fun createSofa(): Sofa {
        return ArtDecoSofa()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return ArtDecoCoffeeTable()
    }

}