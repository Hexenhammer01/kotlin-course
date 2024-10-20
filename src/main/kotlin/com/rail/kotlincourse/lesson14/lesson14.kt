package com.rail.kotlincourse.lesson14

fun main() {

    val fruitsPrice = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrice.entries) {
        println("Key : ${entry.key}, Value: ${entry.value}")
    }
    for ((fruit, price) in fruitsPrice.entries) { //Деструктуризация
        println("Key : ${fruit}, Value: ${price}")
    }

}