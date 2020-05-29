package creational.factorymethod.basic

interface LogisticsFactory {
    fun planDelivery()
    fun createTransport() : Transport
}