package com.rail.kotlincourse.lesson21.homework

interface Validator<T> {
    fun proverka(i: T): Boolean
}