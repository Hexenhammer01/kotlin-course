package com.rail.kotlincourse.lesson13

import java.awt.Graphics

//Проверить, что размер коллекции больше 5 элементов.
//size
//Проверить, что коллекция пустая
//isEmpty
//Проверить, что коллекция не пустая
//isNotEmpty
//Взять элемент по индексу или создать значение если индекса не существует
//getOrElse
//Собрать коллекцию в строку
//joinToString
//Посчитать сумму всех значений
//sum
//Посчитать среднее
//average
//Взять максимальное число
//maxOrNull
//Взять минимальное число
//minOrNull
//Взять первое число или null
//firstOrNull
//Проверить что коллекция содержит элемент
//contains
//Отфильтровать коллекцию по диапазону 18-30
//val filter1 = list.filter { it 18..30 }
//Выбрать числа, которые не делятся на 2 и 3 одновременно
//forEach
//Очистить текстовую коллекцию от null элементов
//filterNot
//Преобразовать текстовую коллекцию в коллекцию длин слов
//map
//Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
//associate
//Отсортировать список в алфавитном порядке
//sorted
//Отсортировать список по убыванию
//sortedDescending
//Распечатать квадраты элементов списка
//forEach
//Группировать список по первой букве слов
//groupBy
//Очистить список от дублей
//distinct
//Взять первые 3 элемента списка
//take
//Взять последние 3 элемента списка
//takeLast

fun main() {
    println(Zadanie2(zadanie = listOf(0, 1, 3, 4, 5, 8, 7, 9, 76, 5, 43, 56)))
    println(Zadanie3(grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)))
    println(
        Zadanie4(
            list = listOf(
                "Стол",
                "табурет",
                "ваза",
                "Кружка",
                "Зеркало",
                "ковер",
                "Шкаф",
                "часы",
                "Люстра",
                "подушка",
                "Картина",
                "столик",
                "Вазон",
                "шторы",
                "Пуф",
                "книга",
                "Фоторамка",
                "светильник",
                "Коврик",
                "вешалка",
                "Подставка",
                "телевизор",
                "Комод",
                "полка",
                "Абажур",
                "диван",
                "Кресло",
                "занавеска",
                "Бра",
                "пепельница",
                "Глобус",
                "статуэтка",
                "Поднос",
                "фигурка",
                "Ключница",
                "плед",
                "Тумба",
                "игрушка",
                "Настенные часы",
                "подсвечник",
                "Журнальный столик",
                "сувенир",
                "Корзина для белья",
                "посуда",
                "Настольная лампа",
                "торшер",
                "Этажерка"
            )
        )
    )
    println(
        Zadanie5(
            list = listOf(
                "Стол",
                "табурет",
                "ваза",
                "Кружка",
                "Зеркало",
                "ковер",
                "Шкаф",
                "часы",
                "Люстра",
                "подушка",
                "Картина",
                "столик",
                "Вазон",
                "шторы",
                "Пуф",
                "книга",
                "Фоторамка",
                "светильник",
                "Коврик",
                "вешалка",
                "Подставка",
                "телевизор",
                "Комод",
                "полка",
                "Абажур",
                "диван",
                "Кресло",
                "занавеска",
                "Бра",
                "пепельница",
                "Глобус",
                "статуэтка",
                "Поднос",
                "фигурка",
                "Ключница",
                "плед",
                "Тумба",
                "игрушка",
                "Настенные часы",
                "подсвечник",
                "Журнальный столик",
                "сувенир",
                "Корзина для белья",
                "посуда",
                "Настольная лампа",
                "торшер",
                "Этажерка"
            )
        )
    )
    println(Zadanie6(numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)))
    println(Zadanie7(ages = listOf(22, 18, 30, 45, 17, null, 60)))
}


fun Zadanie2(zadanie: List<Int>): String {
    return when {
        zadanie.isEmpty() -> "Пусто"
        zadanie.size < 5 -> "Короткая"
        zadanie.getOrNull(0) == 0 -> "Стартовая"
        zadanie.sum() > 1000 -> "Массивная"
        zadanie.average() == 10.0 -> "Сбалансированная"
        zadanie.joinToString { "" }.length == 20 -> "Клейкая"
        zadanie.max() < -10 -> "Отрицательная"
        zadanie.min() > 1000 -> "Положительная"
        zadanie.contains(3) && zadanie.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

fun Zadanie3(grades: List<Int>) = grades.filter { it >= 60 }.sorted().take(3)

fun Zadanie4(list: List<String>) = list.map { it.lowercase() }.groupBy { it[0] }

fun Zadanie5(list: List<String>) = list.map { it.length }.average()

fun Zadanie6(numbers: List<Int>) =
    numbers.distinct().sortedDescending().groupBy { if (it % 2 == 0) "Четные" else "Нечетные" }

fun Zadanie7(ages:List<Int?>) = ages.firstOrNull{ it!! > 18 }.toString() ?:"Подходящий возраст не найден"


