package com.rail.kotlincourse.lesson21.homework


interface Mapper<T, R> {
    fun map(i: T): R
    fun listMap(list: List<T>): List<R>
}