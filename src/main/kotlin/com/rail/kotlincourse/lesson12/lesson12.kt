package com.rail.kotlincourse.lesson12

import java.lang.reflect.AccessFlag

fun main() {
//    val result = sum(6.8, 5.7, false)
    println(sum(6.8, 5.7, false))
    val max: Any = getMax(6, 3)
}

//fun имяФункции(параметры): ТипВозвращаемогоЗначения{
//    //Тело функции
//    return значение
//}

fun sayHello() {
    println("Hellow, world!")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun multiply(a: Int, b: Int): Int = a * b

//Модификаторы доступа

//Публичный и приватные
private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun funalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, terget: Int) {
    for (number in numbers) {
        if (number == terget) {
            println("Value found : $number")
            return
        }
        println("Value not found")
    }

}

fun doSump() = Unit

fun getUserName(): String {
    return ""
}

fun printGrit(grit: String) {}

fun calcArea(area: Double, area1: Double): Double {
    return 9.0
}

fun findMax(ch1: Int, ch2: Int): Int {
    return 6
}

fun isNullOr(n: String?): Boolean {
    return false
}

fun calcDisc(disc: List<String>, arg: Int?): Double? {
    return null
}

fun sum(first: Double, sec: Double, flag: Boolean): Double {
    return if (flag) {
        first + sec
    } else {
        first - sec
    }
}

fun getMax(f: Int, s: Int) = if (f < s) s else "f"
