package com.rail.kotlincourse.lesson10

import javax.swing.text.MaskFormatter

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(numbers.toList())

    val emptyQ = Array(10) { " " }
    println(emptyQ.toList())

    val doublesQ = Array<Double>(5) { 0.0 }
    for (i in doublesQ.indices) {
        doublesQ[i] = i * 2.0
    }
    println(doublesQ.toList())

    val tripleQ = Array<Int>(5) { 0 }
    for (q in tripleQ.indices) {
        tripleQ[q] = q * 3
    }
    println(tripleQ.toList())

    val nulleblsQ = arrayOfNulls<String>(3)
    nulleblsQ[0] = null
    nulleblsQ[1] = "string1"
    nulleblsQ[2] = "string2"
    println(nulleblsQ.toList())

    val mas = arrayOf(1, 2, 3)
    val copyMas = Array<Int>(3) { 0 }
    for (i in copyMas.indices) {
        copyMas[i] = mas[i]
    }
    println(copyMas.toList())

    val mas1 = arrayOf(1, 2, 3)
    val mas2 = Array(3) { 0 }
    for (i in mas2.indices) {
        mas2[i] = mas1[i]
    }
    println(mas2.toList())

    val mas3 = arrayOf(1, 2, 3)
    val mas4 = arrayOf(4, 5, 6)
    val emptMas = Array(3) { 0 }
    for (i in emptMas.indices) {
        emptMas[i] = mas3[i] - mas4[i]
    }
    println(emptMas.toList())

    val mas5 = arrayOf(1, 2, 3, 4, 6, 7)
    var iz = 0
    while (iz in mas5.indices) {
        if (mas5[iz] == 5) {
            println(iz); break
        }
        iz++
    }
    println(-1)

    val mas6 = arrayOf(1, 3, 4, 5, 6)
    for (i in mas6) {
        if (i % 2 == 0) {
            println("$i четное")
        } else
            println("$i нечетное")
    }

    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    println(list)

    val list1 = listOf("Hello", "World", "Kotlin")
    println(list1)

    val numbers1 = mutableListOf(1, 2, 3, 4, 5)
    println(numbers1)

    numbers1.add(4, 5)
    numbers1.add(1, 3)
    println(numbers1)

    val list2 = mutableListOf("Hello", "World", "Kotlin")
    list2.remove("World")
    println(list2)

    val list3 = listOf<Int>(0, 1, 22, 3, 4, 5, 6, 7)
    for (rr in list3.indices) {
        println(list3[rr])
    }

    val list4 = listOf<String>("q", "e", "r", "y")
    println(list4[1])

    val list5 = mutableListOf<Int>(6, 7, 8, 9, 10)
    list5[1] = 1245
    println(list5)

    val list6 = mutableListOf("r", "t", "y")
    val list7 = mutableListOf("a", "s", "d")
    for (i in list6) {
        list7.add(i)
    }
    println(list7)

    val list8 = listOf<Int>(111, 303, 69, 0)
    var min = list8[0]
    var max = list8[0]
    for (iq in list8) {
        if (iq < min) {
            min = iq
        }
        if (iq > max) {
            max= iq
        }
    }
    println("Максимум $max")
    println("Минимум $min")

    val spis = listOf(145,223,387,454,58,600,712,877,921,104)
    var spis1 = mutableListOf<Int>()
    for (ic in spis){
        if (ic%2==0){
            spis1.add(ic)
        }
    }
    println(spis1)


}

