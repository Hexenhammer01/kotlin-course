package com.rail.kotlincourse.lesson24

import java.io.FileNotFoundException
import java.io.IOException
import java.lang.RuntimeException
import java.lang.reflect.UndeclaredThrowableException

fun main() {
//    throw Exception("Сообщение о ошибке")
//    val exception = Exception ("Сообщение о ошибке")
//    throw exception

//    try {
//        val t = null
//        t!!
//        val r = listOf(1)
//        r[2]
//    } catch (e: NullPointerException) {
//        println("NullPointerException")
//    } catch (e: RuntimeException) {
//        println("ArrayIndexOutOfBoundsException")
//        throw IOException(e)
//    } finally {
//        //Блок, который выполняется всегда, независимо от надичия исключения
//        println("finnaly block")
//    }
//    try {
////        val i: String = 1 as String
//        val q = "2.3645 ".toInt()
//    } catch (e: Throwable) {
//        println("ClassCastException")
//    } catch (e: NumberFormatException) {
//        println("NumberFormatException")
//    }
    setAge(-3)
}
    fun setAge(age:Int){
        require(age>0){
            "Negative"
        }
    }

