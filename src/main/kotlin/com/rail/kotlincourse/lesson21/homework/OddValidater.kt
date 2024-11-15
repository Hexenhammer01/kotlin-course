package com.rail.kotlincourse.lesson21.homework

class OddValidater : Validator<Int> {
    override fun proverka(i: Int): Boolean {
        return if (i.equals(i % 2 == 0)) {
            true
        } else {
            false
        }
    }
}