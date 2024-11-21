package com.rail.kotlincourse.lesson23

import java.util.Objects

fun main() {
    val obj: Any = "Hello"

    if (obj is String) {
        println("Строка")
    }

    if (obj !is Int) {
        println("Не число")
    }

    if (obj is String) {
        println(obj.uppercase())
    }

    val num: Any = 123
    val str: Boolean? = num as? Boolean  //В этом случае вернет null потому как "?" вернет тип или null

    val t = if (num is String) {
        num as String
    } else {
        null
    }

    println(t)


    val nullableStr: String? = "Kot"
    val nonnullableStr: String = nullableStr as String

    println(nonnullableStr)

    val mixedList: List<Any> = listOf("Kot",1,4.2,"Java", true)

    for (item in mixedList){
        when(item){
            is  String -> println("$item - строка длинной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - дабл число")
            else -> println("хз что за тип ")
        }
    }



}

interface Drivable {

    fun drive()

}



interface Flyable {

    fun fly()

}



class FlyingCar : Drivable, Flyable {

    override fun drive() {

        println("Едет как автомобиль")

    }



    override fun fly() {

        println("Летит как самолёт")

    }

}



fun checkCapabilities(drivable: Drivable) {

    drivable.drive()



    if (drivable is Flyable) {

        println("Этот объект также может летать!")

        drivable.fly()

    } else {

        println("Этот объект не может летать.")

    }

}