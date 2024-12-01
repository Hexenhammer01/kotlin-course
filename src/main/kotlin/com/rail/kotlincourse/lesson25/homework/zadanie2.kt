package com.rail.kotlincourse.lesson25.homework

fun srednee(i: List<Double>): Double {
    return i.sum() / i.size
}

val anonimSrednee = fun(i: List<Double>):Double  {
    return i.sum() / i.size
}

val lambdaSrednee: (i: List<Double>) -> Double = { i -> i.sum() / i.size }

val lamdaSredneeNotType = { i: List<Double> -> i.sum() / i.size }


