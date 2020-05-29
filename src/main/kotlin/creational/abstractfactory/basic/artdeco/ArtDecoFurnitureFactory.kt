package creational.abstractfactory.basic.artdeco

import creational.abstractfactory.basic.Chair
import creational.abstractfactory.basic.CoffeeTable
import creational.abstractfactory.basic.FurnitureFactory
import creational.abstractfactory.basic.Sofa

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