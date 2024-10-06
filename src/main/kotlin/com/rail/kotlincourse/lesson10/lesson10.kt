package com.rail.kotlincourse.lesson10

import kotlin.jvm.internal.MutablePropertyReference

fun main() {

    //Массивы
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val numbers1 = arrayOf<Int>()

    val doubles: DoubleArray = doubleArrayOf(1.2, 3.2, 2.1)
    val emptyNullableArray = arrayOfNulls<Int>(5)
    val emptyArray = Array(5) { "" }
    val emptyNullableArray1: Array<Int?> = arrayOfNulls<Int>(5)

    //Списки
    val readOnlyList: List<String> = listOf("q", "w", "e") //Не изменяемый
    val mutableList: MutableList<String> = mutableListOf("q", "w", "e") //Изменяемый

    //Множества
    val numberSet: Set<Int> = setOf(1, 2, 3, 4, 5, 5)
    val mubalbeSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)

    //Методы
    mutableList.add("ui")


    println(doubles[2])
    println(readOnlyList[1])
    println(mutableList[3])

    val set = setOf("K", "o", "t")
    for (letter in set) {
        println("|$letter|")
    }

    val list = listOf(33, 14, 1, -87)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])

        } else {
            println(list[index] + list[index + 1])
        }
    }
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }
    val array = Array(100) { 0 }
    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val array1 = Array(10) { 0 }
    array1[0] = 10
    for (i in array1.indices) {
        array1[i] = (i + 1) * 10

    }
    println(array1.toList())
    val array2 = arrayOf("q", "we", "qtt", "gsd", "nvbm")
    for (i in array2.indices) {
        array2[i] = " "
    }
    println(array2.toList())

    val array3 = arrayOf(2, 3, 4)
    val array4 = arrayOf(5, 6, 7)
    val emptyArray1 = Array(3) { 0 }
    for (i in emptyArray1.indices) {
        emptyArray1[i] = array3[i] + array4[i]
    }

}