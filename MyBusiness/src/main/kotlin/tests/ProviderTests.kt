package tests

import Provider

fun main() {
    val robson = Provider("Robson", "Fulano", "Product A")
    val thiago = Provider("Thiago", "Fulano", "Product B")

    println(robson.getProviderInfos())
    println(thiago.getProviderInfos())
}