package com.rail.kotlincourse.lesson22.homework

import com.rail.kotlincourse.lesson22.homework.extensions.perev
import com.rail.kotlincourse.lesson22.homework.extensions.toChar
import com.rail.kotlincourse.lesson22.homework.extensions.toPair

fun main() {

    println(arrayOf(1,3,4,5,7).toPair())

    println('q'.toChar(4,5,true))

    println()
    println(Pair(null, "абоба").perev())
    println(Pair("абоба", 'f').perev())



}