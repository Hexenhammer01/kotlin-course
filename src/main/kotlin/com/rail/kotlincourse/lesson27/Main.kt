package com.rail.kotlincourse.lesson27

import java.io.File

fun main(){
    val list = mutableListOf(1,3,4)

    println(list.size)
    list.add(2)
    println(list.size)

    val l: MutableList<Int>.() -> Unit= {
        println(size)
        add(2)
        println(size)
    }
    val res = with(list) {
        println(size)
        add(2)
        println(size)
        "hello"
    }

    println(res)

    val result2 = list.run{
        add(6)
        sum()
    }

    val s=File("exs.txt").inputStream()
    val content = s.readBytes()
    println(content)
    s.close()

    val list4 = mutableListOf<Int>().apply {
        add(1)
        add(2)
    }

    list.also{
        println("Добавляем $it")
    }.add(3)

    val str:String? ="Hello"
    str?.let {
        println(it.length)
    }


}