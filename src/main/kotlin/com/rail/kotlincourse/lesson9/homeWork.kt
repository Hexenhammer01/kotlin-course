package com.rail.kotlincourse.lesson9

fun main() {
    val message = "Александр! С Днем Рождения!"

    for (i in 0 until message.length) {
        for (q in 0 until i * 2) {
            print(" ")
        }

        println(message[i])
    }

}