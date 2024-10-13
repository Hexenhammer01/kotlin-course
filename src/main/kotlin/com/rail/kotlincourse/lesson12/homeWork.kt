package com.rail.kotlincourse.lesson12

fun main() {
    println(multiplyByTwo(5))
    println(isEven(5))
    println(printNumbersUntil(0))
    val f = listOf(-5, -10, 6, 3)
    println(findFirstNegative(f))
    val g = listOf("aбоба", null, "зелибоба")
    println(processList(g))
    println(drawRectangle(89, 77))

}

fun empt() {}

fun sum1(q: Int, w: Int): Int {
    return q + w
}

fun st(e: String): Unit {}

fun l(ll: List<Int>): Double {
    return 9.0
}

fun nullableList(nL: String?): Int? {
    return null
}

fun emptyNull(): Double? {
    return null
}

fun emptyResult(re: String?): Unit {}

fun intNull(intN: Int): String? {
    return null
}

fun stringNull(): String? {
    return null
}

fun stringIntNull(s: String?, i: Int?): Boolean {
    return false
}

fun multiplyByTwo(ch: Int): Int {
    return ch * 2
}

fun isEven(even: Int): Boolean {
    return if (even % 2 == 0) {
        true
    } else {
        false
    }
}

fun printNumbersUntil(n: Int): Unit {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

fun findFirstNegative(f: List<Int>): Int? {
    for (i in f) {
        if (i < 0) {
            return i
        }
    }
    return null
}

fun processList(g: List<String?>) {
    for (r in g) {
        if (r == null) {
            return
        }
        println(r)
    }
}

fun drawRectangle(w: Int, h: Int) {
    checkSize(w,"weight")
    checkSize(h,"hight")

    TopLine(w)
    MiddleLine(w, h)
    TopLine(w)
}


private fun checkSize(wh: Int, exc:String) {
    if (wh <= 0) throw IllegalArgumentException("$exc должно быть положительным и больше нуля")
}
private fun TopLine(w: Int) {
    var topLine = "+"
    for (i in 1 until w - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)
}

private fun MiddleLine(w: Int, h: Int) {
    for (i in 1 until h - 1) {
        var middleLine = "|"
        for (j in 1 until w - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }
}
