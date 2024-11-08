package com.rail.kotlincourse.lesson18.homeWork18

import kotlin.math.sqrt

class Triangle(val side1: Double, val side2: Double, val side3: Double) : Shape() {
    val q = (side1 + side2 + side3) / 2
    override fun area(): Double {
        return sqrt(q * (q - side1) * (q - side2)* (q - side3))
    }
}