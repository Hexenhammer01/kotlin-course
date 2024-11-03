package com.rail.kotlincourse.lesson18.homeWork18

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}