package com.rail.kotlincourse.lesson18.homeWork18

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    animals.forEach {
        it.makeSound("bark")
    }
    val figures: List<Shape> = listOf(Square(43.6), Circle(567.0), Triangle(8578.0, 456.0, 347.0))
    figures.forEach { figure ->
        println(figure.area())
    }
}