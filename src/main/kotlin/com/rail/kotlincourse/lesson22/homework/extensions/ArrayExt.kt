package com.rail.kotlincourse.lesson22.homework.extensions

fun Array<Int>.toPair(): Pair<Int, Int> {
    return if (this.size >= 2) {
        this[0] to this[1]
    } else{
        Pair(0, 0)
    }

}
