package com.rail.kotlincourse.lesson25.homework


fun zadanie3(q: List<String>, w: Int): List<String> {
    require(q.isNotEmpty()) { "пустой список" }
    val result = mutableListOf<String>()
    for (i in q) {
        if (i.length >= w) {
            result.add(i)
        }
    }
    return result
}

val anonimSpisok = fun(q: List<String>, w: Int): List<String> {
    require(q.isNotEmpty()) { "пустой список" }
    val result = mutableListOf<String>()
    for (i in q) {
        if (i.length >= w) {
            result.add(i)
        }
    }
    return result
}

val lambdaSpisok: (q: List<String>, w: Int) -> List<String> = { q, w ->
    require(q.isNotEmpty()) { "пустой список" }
    val result = mutableListOf<String>()
    for (i in q) {
        if (i.length >= w) {
            result.add(i)
        }
    }
    result
}

val lamdaSpisokNotType = { q: List<String>, w: Int ->
    require(q.isNotEmpty()) { "пустой список" }
    val result = mutableListOf<String>()
    for (i in q) {
        if (i.length >= w) {
            result.add(i)
        }
    }
    result
}

