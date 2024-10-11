package com.rail.kotlincourse.lesson11

fun main() {

    val pair: Pair<Int, String> = 1 to "a"
    val pair2 = Pair(2, "a")

    println(pair.first)
    println(pair.second)

    val emptyMap: Map<String, String> = mapOf<String, String>()

    val q1 = "Россия" to "Москва"
    val q2 = "Франция" to "Париж"

    val capitals1 = mapOf(q1, q2)

    val capitals = mapOf(
        "Россия" to "Москва",
        "Франция" to "Париж"
    )

    val map = mapOf(1 to "a", 2 to "b", 3 to "c") //Неизменяемый потому как не mutable

    val mutableMap =
        mutableMapOf("Россия" to "Москва", "Франция" to "Париж") //Изменяемый, можем заменять значение по ключу
    val capitalOfRussia = capitals1["Россия"]
    println(capitalOfRussia)

    mutableMap["Германия"] = "Берлин" //Добавление
    mutableMap.remove("Франция") //Удаление, удаляет по ключу, и ключ и значение

//Переборы
    for (entries in mutableMap) {
        println("${entries.key}:${entries.value}") //Перебор!
    }
    for ((country, capital) in capitals1) {
        println("$country:$capital")
    }

    val mapWithNull = mutableMapOf<String?, Int>(null to 1)
}

