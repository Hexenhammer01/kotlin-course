package com.rail.kotlincourse.lesson25.homework


fun main() {

    //zadaie1
    println(com.rail.kotlincourse.lesson25.homework.file)
    anonimFun()
    lambda()
    lambdaNotType()

    //zadanie2
    val i1 = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
    println(srednee(i1))
    println(anonimSrednee(i1))
    println(lambdaSrednee(i1))
    println(lamdaSredneeNotType(i1))

    //zadanie3
    try {
        val i2 = listOf("aboba", "biba", "boba", "ameba")
        println(zadanie3(i2,5))
        println(anonimSpisok(i2,76))
        println(lambdaSpisok(i2,1))
        println(lambdaSpisokNotType(i2,88))
        val i3 = emptyList<String>()
        println(zadanie3(i3,0))

    }catch (e:Throwable){
        println("${e.message}")
    }




}

