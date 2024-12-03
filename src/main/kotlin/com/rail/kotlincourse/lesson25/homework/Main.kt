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
    val i2 = listOf("aboba", "biba", "boba", "ameba")
    try {
        println(zadanie3(i2,5))
        println(anonimSpisok(i2,76))
        println(lambdaSpisok(i2,1))
        val i3 = emptyList<String>()
        println(zadanie3(i3,0))
        println(lamdaSpisokNotType(i2,65))

    }catch (e:Throwable){
        println("${e.message}")
    }

    //zadanie4
    val i3: Any = 1234567890
    val i4: Any = "9876543210"
    val i5:Any = emptyArray<String>()
    println(zadanie4(i3))
    println(zadanie4(i3))
    println(anonimSumma(i3))
    println(anonimSumma(i4))
    println(lambdaSumma(i3))
    println(lambdaSumma(i4))
    println(lambdaNotTypeSumma(i4))
    try {
        println(zadanie4(i5))
    }catch (e:Throwable){
        println("${e.message}")
    }

    //zadanie5
    val i6 = listOf(5,6,7,6,5,4,2,1)
    println(zadanie5(i6))
    println(anonimToSet(i6))
    println(lambdaToSet(i6))
    println(lambdaNotTypeSet(i6))

    //zadanie6
    val i7 = mapOf("1" to 1, "2" to 2, "3" to 3, "4" to 4)
    try {
    println(zadanie6(i7,4))
    println(anonimMap(i7,32))
    println(lambdaMap(i7,33))
    println(lambdaNotTypeMap(i7,11))

    }catch (e:Throwable){
        println("${e.message}")
    }










}

