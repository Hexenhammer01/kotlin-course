package com.rail.kotlincourse.lesson22.homework.extensions

fun <T, R> Pair<T?,R?>.perev(): Pair<R?, T?> {
    return second to first
}