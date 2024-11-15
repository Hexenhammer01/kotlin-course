package com.rail.kotlincourse.lesson21.homework

class ListValidator<T : Number> : Validator<List<T?>> {
    override fun proverka(i: List<T?>) : Boolean{
        return !i.contains(null) && i.all { it?.toDouble() !=0.0 }
    }
}
