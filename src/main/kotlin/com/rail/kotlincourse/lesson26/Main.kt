package com.rail.kotlincourse.lesson26

import com.rail.kotlincourse.lesson25.homework.printFile

fun progressWebData(
    query: String,
    fetcher: (String) -> List<Map<String, Any>>,
    trans: (List<Map<String, Any>>) -> List<User>,
    displ: (List<User>) -> Unit,
) {
    val rawData = fetcher(query)
    val transData = trans(rawData)
    displ(transData)
}

data class User(val name: String)

fun main() {
    val fetcher: (String) -> List<Map<String, Any>> = {
        // orm.select(it).map{ listOf() }
        listOf(mapOf("2" to "fqef"))
    }

    val trans: (List<Map<String, Any>>) -> List<User> = {
        it.map { map -> User(map.keys.first()) }
    }
    val displ: (List<User>) -> Unit = {
        println(it)
    }
//    progressWebData("qefwe wef", fetcher, trans, displ)
    println(progressWebData("qefwe wef", fetcher, trans, displ))
}