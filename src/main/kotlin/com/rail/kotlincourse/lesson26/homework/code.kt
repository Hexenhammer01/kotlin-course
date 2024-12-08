package com.rail.kotlincourse.lesson26.homework

fun filterStrings(
    h: List<String>,
    fil: (String) -> Boolean
): List<String> {
    return h.filter(fil)
}

fun applyToNumbers(
    k: List<Int>,
    pre: (Int) -> Int
): List<Int> {
    return k.map(pre)
}

fun sumByCondition(
    l:List<Int>,
    b:(Int)-> Boolean
): Int{
    return l.filter(b).sum()
}

fun main(){
    val h = listOf("абоба","пави","смячмя")
    println(filterStrings(h) { it.length > 4 })
    println(filterStrings(h) { "а" in it })

    val k = listOf(1, 2, -1, 5, -10)
    val k2 = listOf(1.0, 2.0, -1.0, 5.0, -10.0)
    println(applyToNumbers(k) { it.toInt() * 2 })


    val l = listOf(1, -2, 3, -4, 5, -6)

    println(sumByCondition(l) { it.toDouble() > 0 })
}