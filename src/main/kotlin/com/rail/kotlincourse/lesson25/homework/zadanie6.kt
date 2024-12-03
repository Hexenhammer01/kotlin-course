package com.rail.kotlincourse.lesson25.homework
//Задание 6. Создай функцию расширение словаря из строк и чисел,
// которая принимает число и возвращает список ключей, длина которых меньше их значений но больше заданного в функции аргумента.
// В случае если список получается пустой нужно выкинуть исключение IllegalState.


fun zadanie6(z: Map<String, Int>, f: Int): List<String> {
    val j = mutableListOf<String>()
    for ((key, value) in z) {
        if (key.length > f && key.length < value) {
            j.add(key)
        }
    }
    if (j.isEmpty()) {
        throw IllegalStateException("empty")
    }
    return j
}

val anonimMap = fun(z: Map<String, Int>, f: Int): List<String> {
    val j = mutableListOf<String>()
    for ((key, value) in z) {
        if (key.length > f && key.length < value) {
            j.add(key)
        }
    }
    if (j.isEmpty()) {
        throw IllegalStateException("empty")
    }
    return j
}

val lambdaMap: (Map<String, Int>, Int) -> List<String> = { z, f ->
    val j = mutableListOf<String>()
    for ((key, value) in z) {
        if (key.length > f && key.length < value) {
            j.add(key)
        }
    }
    if (j.isEmpty()) {
        throw IllegalStateException("empty")
    }
    j
}

val lambdaNotTypeMap = { z: Map<String, Int>, f: Int ->
    val j = mutableListOf<String>()
    for ((key, value) in z) {
        if (key.length > f && key.length < value) {
            j.add(key)
        }
    }
    if (j.isEmpty()) {
        throw IllegalStateException("empty")
    }
    j
}


