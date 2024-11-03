package com.rail.kotlincourse.lesson18.homeWork18

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}