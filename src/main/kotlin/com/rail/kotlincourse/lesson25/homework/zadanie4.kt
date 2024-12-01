package com.rail.kotlincourse.lesson25.homework

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