package creational.factorymethod.gof

interface LogisticsFactory {
    fun planDelivery()
    fun createTransport() : Transport
}