package com.rail.kotlincourse.lesson21.homework

class ListHolder <T>(private val list: () -> Int) {
    fun add1(elem: T) {
        list.add(elem)
    }

    fun remove(): List<T> {
        return list
    }
}