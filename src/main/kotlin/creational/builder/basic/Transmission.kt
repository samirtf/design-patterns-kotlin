package creational.builder.basic

interface Transmission {
    fun getGears(): String
    fun shiftUp();
    fun shiftDown();
}