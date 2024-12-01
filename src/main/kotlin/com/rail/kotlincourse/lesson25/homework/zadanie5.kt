package com.rail.kotlincourse.lesson25.homework

//Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun zadanie5(t: List<Int>): Set<Int> {
    return t.toSet()
}

val anonimToSet = fun(t: List<Int>): Set<Int> {
    return t.toSet()
}

val lambdaToSet: (t: List<Int>) -> Set<Int> = {t->
    t.toSet()
}


val lambdaNotTypeSet = {t:List<Int> ->
    t.toSet()
}