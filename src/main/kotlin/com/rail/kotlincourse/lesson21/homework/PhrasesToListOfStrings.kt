package com.rail.kotlincourse.lesson21.homework

abstract class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(i: String): List<String> {
        return i.split(" ")
    }

    override fun listMap(list: List<String>): List<List<String>> {
        return list.map { it.split("") }
    }
}