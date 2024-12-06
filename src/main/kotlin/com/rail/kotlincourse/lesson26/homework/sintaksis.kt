package com.rail.kotlincourse.lesson26.homework

fun zadanie1(q: () -> Unit) {
    q()
}

fun zadanie2(w: (Int) -> String): String {
    val e = 1
    return w(e)
}

fun zadanie3(r: Int.(String) -> Boolean): Boolean {
    val t = 2
    val y = "qweqw"
    return t.r(y)
}

fun zadanie4(argum: (Double, Double) -> Boolean): Boolean {
    val u = 234.66
    val i = 689.56
    return argum(u, i)
}

fun <T> zadanie5(perviyD: (T) -> List<T>, elem: T): List<T> {
    return perviyD(elem)
}

fun zadanie6(param1: (String) -> (Int) -> Boolean): (Int) -> Boolean {
    val str = "asfasf"
    return param1(str)
}

fun zadanie7(
    query: List<Int>,
    fetch: Set<String>,
    transform: (List<Int>, Set<String>) -> Map<String, Int>
): Map<String, Int> {
    return transform(query, fetch)
}

fun zadanie8(chislo: Int, fun1: (Int) -> String): String {
    return fun1(chislo)
}

//zadanie9 - я все себе сломал
//fun zadanie9(pervFun()->()-Unit{
//val perem = pervFun






