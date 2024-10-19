package com.rail.kotlincourse.lesson13

import com.rail.kotlincourse.lesson4.printMessage

fun main() {
    val list = listOf(3, 356, 357, 23, 1243, 1324, 134, 213, 21, 12)
    val filtred1 = filter(list)
    println(filtred1)

    val filtered2 = list.filter { it in 7..17 }
    println(filtered2)

    val numbers = listOf(-1, 2, -3, 4, -5)
    val positNum = numbers.filter { it > 0 } //Фильтр
    println(positNum)

    val notPos = numbers.filterNot { it > 0 } //Фильтр обратного действия
    println(notPos)

    val nullableList: List<Int?> = listOf(1, null, 2, null, 3)
    val nonNull: List<Int> = nullableList.filterNotNull() // Отфильтрует Null значения , не принимает аргументы
    println(nonNull)

    val firstPositive: Int? = numbers.firstOrNull { it > 0 } //Возвращает первое значение из списка
    println(firstPositive)

    val elementOr = numbers.getOrElse(10) { -1 } //Получение элементов по индексу
    println(elementOr)

    val incrementNumbers: List<Int> =
        numbers.map { it + 1 } //Из коллекции создает коллекции изменяя содержание коллекции
    println(incrementNumbers)

    val numSquareMap =
        numbers.associate { it to it * it } //Из коллекции создает словарь, описываем как создавать пару внутри {}
    println(numSquareMap)

    val multiplyList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )

    val flattenList = multiplyList.flatten() //При вложенных списках метод склеивает в один общий список
    println(flattenList)

    val flattenListMap = multiplyList.flatMap { list1 ->
        list1.map { it * 2 }
    } //
    println(flattenListMap)

    val numbersString: String = numbers.joinToString(separator = " % ") { "$it * $it" } //Создает строку и склеивает
    println(numbersString)

    val sortedNumbers = numbers.sorted() //Сортирует по порядку любые типа

    println(sortedNumbers)

    val sortedDesc = numbers.sortedDescending() //Сортирует в обратном порядке любые типы
    println(sortedDesc)

    numbers.forEach { println(it) } // Все что можно перебрать
    (1..8).forEach { println(it) }


    val sunOf = numbers.sum() // Просчитает сумму
    println(sunOf)

    val averaOfNum: Double = numbers.average() // Посчитает сумму и разделит на количество, получит среднее значение
    println(averaOfNum)

    val maxNumb = numbers.maxOrNull() // Вернет максимальное значение или null если список пуст
    println(maxNumb)

    val minNumb = numbers.minOrNull() // Вернет минимальное значение или null если пустой
    println(minNumb)

    val groupBySi =
        numbers.groupingBy { if (it > 0) "Positive" else "Negative" } // Группирует значения в соответствии условиям
    println(groupBySi)

    val distincctNum = listOf(1, 4, 3, 5, 6, 3, 7).distinct() // Вернет список из уникальных значений
    println(distincctNum)

    println(numbers.take(4)) // Вернет количество указанных элементов

    println(numbers.takeLast(3)) // Вернет последние указанное количество элементов

    println(numbers.size) // Вернет количество элементов


}

fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}