package com.rail.kotlincourse.lesson25.homework

//Задание 1. Создай константу в файле с текстом. Создай функцию, которая ничего не принимает и не возвращает и печатает в консоль текст константы.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь как функция работает

const val file = "Текст константы"


fun printFile() {
    println(file)
}

val anonimFun = fun() {
    println(file)
}

val lambda: () -> Unit = {
    println(file)
}

val lambdaNotType = {
    println(file)
}


