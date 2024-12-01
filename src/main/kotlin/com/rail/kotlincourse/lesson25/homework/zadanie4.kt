package com.rail.kotlincourse.lesson25.homework
////Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
////По аналогии с предыдущим заданием выполни трансформации и проверки.
////Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()
fun zadanie4(r: Any): Int {
    require(r.toString().isNotEmpty()) { "Пустой" }
    return r.toString().sumOf { it.digitToInt() }
}

val anonimSumma = fun(r: Any): Int {
    require(r.toString().isNotEmpty()) { "Пустой" }
    return r.toString().sumOf { it.digitToInt() }
}

val lambdaSumma: (r: Any) -> Int = { r ->
    require(r.toString().isNotEmpty()) { "Пустой" }
    r.toString().sumOf { it.digitToInt() }
}
val lambdaNotTypeSumma = { r:Any ->
    require(r.toString().isNotEmpty()) { "Пустой" }
    r.toString().sumOf { it.digitToInt() }
}

//https://kotlinlang.org/docs/collection-aggregate.html#fold-and-reduce