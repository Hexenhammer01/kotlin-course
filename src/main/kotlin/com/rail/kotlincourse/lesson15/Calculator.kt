package com.rail.kotlincourse.lesson15

import java.lang.Runtime.Version

class Calculator {

    companion object {

        const val Version = 32
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}