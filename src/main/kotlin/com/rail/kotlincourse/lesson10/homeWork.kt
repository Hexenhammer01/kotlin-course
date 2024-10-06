package com.rail.kotlincourse.lesson10

import com.rail.kotlincourse.lesson4.printMessage
import java.io.StringReader
import javax.swing.text.MaskFormatter

fun main() {
//    Работа с массивами Array
//1
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(numbers.toList())
//2
    val emptyQ = Array(10) { " " }
    println(emptyQ.toList())
//3
    val doublesQ = Array<Double>(5) { 0.0 }
    for (i in doublesQ.indices) {
        doublesQ[i] = i * 2.0
    }
    println(doublesQ.toList())
//4
    val tripleQ = Array<Int>(5) { 0 }
    for (q in tripleQ.indices) {
        tripleQ[q] = q * 3
    }
    println(tripleQ.toList())
//5
    val nulleblsQ = arrayOfNulls<String>(3)
    nulleblsQ[0] = null
    nulleblsQ[1] = "string1"
    nulleblsQ[2] = "string2"
    println(nulleblsQ.toList())
//6
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
//7
    val mas3 = arrayOf(1, 2, 3)
    val mas4 = arrayOf(4, 5, 6)
    val emptMas = Array(3) { 0 }
    for (i in emptMas.indices) {
        emptMas[i] = mas3[i] - mas4[i]
    }
    println(emptMas.toList())
//8
    val mas5 = arrayOf(1, 2, 3, 4, 6, 7)
    var iz = 0
    while (iz in mas5.indices) {
        if (mas5[iz] == 5) {
            println(iz); break
        }
        iz++
    }
    println(-1)
//9
    val mas6 = arrayOf(1, 3, 4, 5, 6)
    for (i in mas6) {
        if (i % 2 == 0) {
            println("$i четное")
        } else
            println("$i нечетное")
    }
//Работа со списками List
//    1
    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    println(list)
//2
    val list1 = listOf("Hello", "World", "Kotlin")
    println(list1)
//3
    val numbers1 = mutableListOf(1, 2, 3, 4, 5)
    println(numbers1)
//4
    numbers1.add(4, 5)
    numbers1.add(1, 3)
    println(numbers1)
//5
    val list2 = mutableListOf("Hello", "World", "Kotlin")
    list2.remove("World")
    println(list2)
//6
    val list3 = listOf<Int>(0, 1, 22, 3, 4, 5, 6, 7)
    for (rr in list3.indices) {
        println(list3[rr])
    }
//7
    val list4 = listOf<String>("q", "e", "r", "y")
    println(list4[1])
//8
    val list5 = mutableListOf<Int>(6, 7, 8, 9, 10)
    list5[1] = 1245
    println(list5)
//9
    val list6 = mutableListOf("r", "t", "y")
    val list7 = mutableListOf("a", "s", "d")
    for (i in list6) {
        list7.add(i)
    }
    println(list7)
//10
    val list8 = listOf<Int>(111, 303, 69, 0)
    var min = list8[0]
    var max = list8[0]
    for (iq in list8) {
        if (iq < min) {
            min = iq
        }
        if (iq > max) {
            max = iq
        }
    }
    println("Максимум $max")
    println("Минимум $min")
//11
    val spis = listOf(145, 223, 387, 454, 58, 600, 712, 877, 921, 104)
    var spis1 = mutableListOf<Int>()
    for (ic in spis) {
        if (ic % 2 == 0) {
            spis1.add(ic)
        }
    }
    println(spis1)
//Работа с Множествами Set
// 1
    val emptySet = setOf<Int>()
    println(emptySet)
//2
    val intSet = setOf(1, 2, 3)
    println(intSet)
//3
    val stringSet = mutableSetOf("Kotlin", "Java", "Scala")
    println(stringSet)
//4
    stringSet.add("Swift")
    stringSet.add("Go")
    println(stringSet)
//5
    val intSet1 = mutableSetOf(1, 2, 3, 4, 5)
    intSet1.remove(2)
    println(intSet1)
//6
    val intSet3 = mutableSetOf(123, 321, 234, 345)
    for (it in intSet3) {
        println(it)
    }
//7  (функция ниже - stringNull)
    val set = setOf("aboba", "baobab", "boba")
    val sString = "bob"
    println("$sString в множестве: ${stringNull(set, sString)}")

//8
    val uniq = setOf("q", "w", "e")
    val uniq1 = mutableSetOf("e", "r", "t")
    for (iq in uniq) {
        uniq1.add(iq)
    }
    println(uniq1)

//9
    val wSet = setOf(1, 2, 3, 4, 5, 6, 7)
    val eSet = setOf(5, 6, 7, 8, 9)
    val rSet = mutableSetOf<Int>()
    for (w in wSet){
        for (e in eSet){
            if (w == e)
                rSet.add(e)
        }
        println(rSet)
    }


}


//7.1
fun stringNull(set: Set<String>, sString: String): Boolean {
    for (iu in set) {
        if (iu == sString) {
            return true
        }
    }
    return false
}


