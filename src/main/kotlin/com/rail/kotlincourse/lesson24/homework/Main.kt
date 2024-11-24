package com.rail.kotlincourse.lesson24.homework

import com.rail.kotlincourse.lesson12.l
import com.rail.kotlincourse.lesson21.homework.getMiddleElement

fun main() {

    //NullPointerException
    val item1:String? = null
    item1 as Char
    println(item1)

    //ArrayIndexOutOfBoundsException
    val item2:Array<*> = arrayOf(1,2,3,4)
    println(item2[4])

    //ClassCastException
    val item3 = "123"
    item3 as Int

    //NumberFormatException
    val item4 = "abc"
    val item5 = item4.toInt()
    println(item5)

    //IllegalArgumentException
    fun checkItem6(numb: Int) {
        require(numb > 0) { "больше 0" }
    }
    println(checkItem6(-4))

    //IllegalStateException
    val item7 = emptyList<String>()
    println(item7.first())

    //OutOfMemoryError
    val item8 = mutableListOf<IntArray>()
    while (true) {
        item8.add(IntArray(100023))
    }

    //StackOverflowError
    function1()


    try {
        val item1: String? = null
        item1 as Char
    } catch (e: NullPointerException) {
        println("NullPointerException")
    }

    try {
        val item2: Array<*> = arrayOf(1, 2, 3, 4)
        item2[4]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException")
    }

    try {
        val item3 = "123"
        item3 as Int
    } catch (e: ClassCastException) {
        println("ClassCastException")
    }

    try {
        val item4 = "abc"
        val item5 = item4.toInt()
        println(item5)
    } catch (e: NumberFormatException) {
        println("NumberFormatException")
    }

    try {
        fun checkItem6(numb: Int) {
            require(numb > 0) { "больше 0" }
        }
        checkItem6(-4)
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException")
    }

    try {
        val item7 = emptyList<String>()
        item7.first()
    } catch (e: IllegalStateException) {
        println("IllegalStateException")
    }

    try {
        val item8 = mutableListOf<IntArray>()
        while (true) {
            item8.add(IntArray(100023))
        }
    } catch (e: OutOfMemoryError) {
        println("OutOfMemoryError")
    }

    try {
        function1()
    }catch (e:StackOverflowError){
        println("StackOverflowError")
    }



    //Zadanie 4
    val mes = "Privki"
    if (mes.length <6 ) {
        throw CustomException("Кастомный эксепшн")
    }else{
        println("Нужная длинна")
    }



}

fun function1() {
    function2()
}

fun function2() {
    function1()
}