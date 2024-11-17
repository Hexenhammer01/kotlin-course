package com.rail.kotlincourse.lesson22.homework.extensions

fun <T> MutableList<T>.element(q: T?, w: Int): T? {
    return this[1]
}