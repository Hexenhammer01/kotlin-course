package com.rail.kotlincourse.lesson24.homework

fun main() = try {
    //NullPointerException
    val item1: String? = null
    item1 as Char
    println(item1)

    //ArrayIndexOutOfBoundsException
    val item2: Array<*> = arrayOf(1, 2, 3, 4)
    println(item2[4])

    //ClassCastException
    val item3 = "123"
    item3 as Int

    //NumberFormatException
    val item41 = "abc"
    val item5 = item41.toInt()
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

} catch (e: Throwable) {
    when (e) {
        is NullPointerException -> println("NullPointerException")
        is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException")
        is ClassCastException -> println("ClassCastException")
        is NumberFormatException -> println("NumberFormatException")
        is IllegalArgumentException -> println("IllegalArgumentException")
        is IllegalStateException -> println("IllegalStateException")
        is OutOfMemoryError -> println("OutOfMemoryError")
        is StackOverflowError -> println("StackOverflowError")
        else -> println("idNow")

    }

}