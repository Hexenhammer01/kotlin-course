package com.rail.kotlincourse.lesson22.homework

import com.rail.kotlincourse.lesson22.homework.extensions.perev
import com.rail.kotlincourse.lesson22.homework.extensions.toChar
import com.rail.kotlincourse.lesson22.homework.extensions.toPair
import com.rail.kotlincourse.lesson22.homework.extensions.within
import java.security.Principal

fun main() {

    println(arrayOf(1,3,4,5,7).toPair())

    println('q'.toChar(4,5,true))

    println(mutableListOf("12e1","12e12","235").toString())

    println(mapOf(1 to "q",2 to "w"))

    println(Pair(null, "абоба").perev())
    println(Pair("абоба", 'f').perev())

    var chis = 234
    println(chis.within(456.25,223))






}