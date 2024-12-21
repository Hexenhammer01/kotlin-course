package com.rail.kotlincourse.lesson30

object NumsObj {
    const val ONE = "One"
    const val TWO = "Two"
    const val THREE = "Three"
}

enum class Nums {
    ONE,
    TWO,
    THREE,
    FOUR
}

fun main() {
    println(NumsObj.THREE)

    val t: Nums = Nums.TWO
    println(Nums.TWO)
    for (n in Nums.entries) {
        println(n)
    }

    DayOfWeek.FRIDAY.printDayType()
}

fun printNums(num: Nums) {
    when (num) {
        Nums.ONE -> println(1)
        Nums.TWO -> println(2)
        Nums.THREE -> println(3)
        Nums.FOUR -> println(4)
    }

}

enum class DayOfWeek(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun printDayType() {
        if (isWeekend) println("$name is a weekend")
        else println("$name is a weekday")
    }

}

enum class CoffeeType(
    val cost: Double,
    val coffeeBase: String,
    val recommendedSugar: Int,
    val hasMilk: Boolean = false
) {

    ESPRESSO(2.50, "Espresso", 0),

    LATTE(3.00, "Latte", 2, true),

    CAPPUCCINO(2.75, "Cappuccino", 1, true),

    AMERICANO(2.25, "Americano", 0);


    fun description() =
        "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."

}