package com.rail.kotlincourse.lesson21.homework

class StringValidator:Validator<String> {
    override fun proverka(i: String): Boolean {
        return i.isNullOrBlank() && i.length != i.count{it==' '}
    }
}