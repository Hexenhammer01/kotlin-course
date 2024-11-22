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

fun getStringLengthOrZero(zero: Any?): Int {
    val z: String? = zero as? String
    return z?.length
        ?: 0
}

fun DDouble(d: Any): Double {
    return when (d) {
        is Number -> {
            d.toDouble() * d.toDouble()
        }

        is String -> {
            val strD = d.toDouble()
            strD * strD
        }

        else -> {
            0.0
        }
    }
}

fun sumIntOrDoubleValues(value: List<Any>): Double {
    var sum = 0.0
    for (i in value) {
        when (i) {
            is Int -> sum = sum + i
            is Double -> sum = sum + i
        }
    }
    return sum
}

fun tryCastToListAndPrint(cast: Any):


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

    println(DDouble(5))

    println(sumIntOrDoubleValues(listOf(1, 2.3, "qweqw", 456, true)))

}