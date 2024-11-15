package com.rail.kotlincourse.lesson21.homework


class ListHolder<T>() {
    private val list: MutableList<T> = mutableListOf()
    fun add(element: T) {
        list.add(element)
    }

    fun get(): List<T> {
        return list.toList()
    }
}