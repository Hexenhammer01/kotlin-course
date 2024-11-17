package com.rail.kotlincourse.lesson22.homework.extensions

fun Number.within(other: Number, deviation: Number): Boolean {

    val tekushee = this.toDouble()
    val sravnenie = other.toDouble()
    val otklonenie = deviation.toDouble()

    val raznica = tekushee - sravnenie


    return if (raznica < 0) -raznica <= otklonenie
    else raznica <= otklonenie
}