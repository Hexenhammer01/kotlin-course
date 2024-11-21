package com.rail.kotlincourse.lesson23.homework


fun analyzeDataType(type: Any) {
    when (type) {
        is String -> println("Это строка: $type")
        is Int -> println("Это число: $type")
        is List<*> -> println("Это список, количество элементов: ${type.size}")
        is Map<*, *> -> println("Это карта, количество пар:${type.size}")
        else -> println("Неизвестный тип данных")
    }

}

fun safeCastToList(param: Any): Int {
//    val p = if (param is List<*>){
//        println("${param.size}")
//    } else {
//        return println("-1")
//    }
    val p: List<*>? = param as? List<*>
    return if (p != null) {
        p.size
    } else {
        -1
    }
}

fun getStringLengthOrZero(zero:Any?): Int {
    val z:String? = zero as? String
    return z?.length
        ?:0
}



fun main() {
    analyzeDataType("qweqwe")
    analyzeDataType(23423)
    analyzeDataType(listOf("q", "w", "e"))
    analyzeDataType(mapOf(1 to "sdagf", 2 to "ertyer"))
    analyzeDataType(12123.123)

    println(safeCastToList(listOf("qw", "qwdq")))
    println(safeCastToList("sbsfb"))

    println(getStringLengthOrZero("qweerqw"))
    println(getStringLengthOrZero(null))
    println(getStringLengthOrZero(456))
}