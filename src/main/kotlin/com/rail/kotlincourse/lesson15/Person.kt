package com.rail.kotlincourse.lesson15

class Person(
    val name: String,
    var age: Int = 30
) {

    private var isAlive = true

    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}