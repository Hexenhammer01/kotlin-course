package com.rail.kotlincourse.lesson25

import org.w3c.dom.Text
import kotlin.coroutines.coroutineContext

fun main() {

    val increment = fun(a: Int): Int {
        return a + 1
    }

    val increment1: (a: Int) -> Int = {
        it + 1
    }

    val increment2 = { a: Int ->
        a + 1
        println("")
    }

    println(increment(5))

    val findIndex = fun(text: String, word: String, ignorecase: Boolean): Int {
        return text.indexOf(word, 0, ignorecase)
    }

    println(findIndex("I love Kotlin", "Love", false))

    val findIndex1: (String, String, Boolean) -> Int = { text, word, ignorecase ->
        text.indexOf(word, 0, ignorecase)
    }

    val findIndex2 = {text:String,word:String , ignorecase:Boolean->
        text.indexOf(word,0,ignorecase)
    }

}

fun findIndex(text: String, word: String, ignorecase: Boolean = false): Int {
    return text.indexOf(word, 0, ignorecase)
}

//обычная функция
fun increment(a: Int): Int {
    return a + 1
}