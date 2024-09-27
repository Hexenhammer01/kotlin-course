package com.rail.kotlincourse.lesson8



fun main(){
//    val simpleString = "Это простая строка"
//
//    val firsName = "Иван"
//    val lastName = "Иванов"
//    val fullName = "$firsName $lastName"
//
//    val age = 30
//    val greeting = "Привет! Меня зовут $firsName, и мне $age лет."
//
//    println(greeting)
//
//    val person = Person(name = "Алексей", age = 25)
//    val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет"
//
//
//    val details = "Здесь находятся ${getDetails()}"
//    println(details)
//
//    val x = 10
//    val y = 20
//    val resultString = "Результат сложения x и y равен ${x + y}"
//    println(resultString)
//}
//class Person(val name: String, val age: Int)
//
//fun getDetails(): String{
//    return "Очень интересные детали"

    val originalString = "Kotlin is fun"
    val subString = originalString.substring(startIndex =  7)
    val subString2 = originalString.substring(3,6)
    val replaceString = originalString.replace(oldValue = "fun", newValue = "awesome")
    val words = originalString.split( " ")

    println(words)
}