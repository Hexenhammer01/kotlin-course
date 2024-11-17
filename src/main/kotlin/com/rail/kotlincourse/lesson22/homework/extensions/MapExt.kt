package com.rail.kotlincourse.lesson22.homework.extensions

fun <T> Map<T, Int>.toMap1(q: Int): Map<String, T?> {
    val result = mutableMapOf<String, T?>()
    return result
}