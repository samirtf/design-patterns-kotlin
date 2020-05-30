package creational.builder.gof

interface Transmission {
    fun getGears(): String
    fun shiftUp();
    fun shiftDown();
}