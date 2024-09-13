package com.rail.kotlincourse.lesson4

val myInt : Int = 123123
val myFloat : Float = 0.443F
val myLong : Long = 12_12312_1231 //обычно хранится время в таймстемп полагаю
val myShort : Short = 32000
val myByte : Byte = 123
val myDouble : Double = 0.345234

val myBoolean : Boolean = false

val myletter : Char = '1' //Одиночный символ, что угодно , обрамляется строго одиночными кавычками

val myString : String = "Строки можно вставлять любой длинны, даже можно оставить пустыми, но их нельзя обновлять"

//КОЛЛЕКЦИИ

val numbers : Array<Int> = arrayOf(1,2,3) //неизменяемое
val strings : MutableList<String> = mutableListOf("one","two","one") //изменяемое
val doubles : Set<Double> = setOf(23.2, 123.4)

val keyValues : Map<String, String> = mapOf(
    "Ключ 1" to "значение 1",
    "Ключ 2" to "значение 2"
)
val anything : Any = false //что угодно можно задать

fun printMessage (message: String) {
    println(message)
}

fun fail (message: String) : Nothing {
    throw IllegalArgumentException(message)
}