package com.rail.kotlincourse.lesson23.homework


fun analyzeDataType(type:Any){
        when(type){
            is String -> println("Это строка: $type")
            is Int -> println("Это число: $type ")
            is List<*> -> println("Это список, количество элементов: ${type.size}")
            is Map<*, *> -> println("Это карта, количество пар:${type.size}")
            else  -> println( "Неизвестный тип данных")
        }

}



fun main(){
    println(analyzeDataType("qweqwe"))
    println(analyzeDataType(23423))
    println(analyzeDataType(listOf("q","w","e")))
    println(analyzeDataType(mapOf(1 to "sdagf",2 to "ertyer")))
    println(analyzeDataType(12123.123))
}