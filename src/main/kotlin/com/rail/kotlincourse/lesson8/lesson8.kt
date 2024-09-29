package com.rail.kotlincourse.lesson8

import com.rail.kotlincourse.lesson4.printMessage


fun main() {
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
    val subString = originalString.substring(startIndex = 7)
    val subString2 = originalString.substring(3, 6)
    val replaceString = originalString.replace(oldValue = "fun", newValue = "awesome")
    val words = originalString.split(" ")
    val lenght = "Hello".length
    val upper = "hello".uppercase()
    val lower = "HELLO".lowercase()
    val trimmed = "    hello.   ".trim()
    val start = "Kotlin".startsWith("Kot")
    val ends = "Kotlin".endsWith("lin")
    val cont = "Hello".contains("ell")
    val e1: String? = null
    val empty = e1.isNullOrEmpty()
    val blank = "  ".isNullOrBlank()
    val repeat = "ab".repeat(3)
    val letter = originalString[5]
    val indexofChar = "Kotlin".indexOf('h')
    val indexofWord = "Kotlin is the best".indexOf("best")

    val backRevers = "niltoK".reversed()
    val multi = """
               Первая строка
             Вторая строка
           Третья строка
""".trimIndent()
    val string = "Swit summer child"
    val subStringq = string.substring(6)
    val subls = string.substring(6, 12)

    val name = "Alex"
    val city = "MSK"
    val age = 33
    val fCount = 123
    val rating = 4.232
    val balance = 23423.13513
    val text = """
        Имя: %s
        Город: %s
        Возраст: %d
        Количество друзей: %,d
        Рейтинг пользователя: %.1f
        Баланс счета: $%,.2f
    """.trimIndent()
//    println(text.format(name, city, age, fCount, rating, balance))

    println(convert("Для завершения проекта важно"))
    val s = "Kotlin: The Fun Way To Learn Programming"
    println(s.substring(8,19))

    val e = "contact@examle.ru".indexOf("@")
    val e3 = "contact@examle.ru"
    println(e3.substring(e + 1))

    val tel ="123-456-7890"
    val tel1 = tel.substring(8,)
    val split = tel.split("-")
    println("XXX-XXX-${tel1}")
    println("XXX-XXX-${tel.substring(8)}")

    println("XXX-XXX-${split[2]}")
    val origFraze = "Это невозможно выполнить за один день"
    println(fraze(origFraze))

}

fun convert(string: String):String{
    return when{
        string.startsWith("ошибка", true) -> string.replace(oldValue = "ошибка", newValue = "небольшое недорозумение",true)
        string.endsWith("важно",true) -> "$string...но не критично"
        else -> ""
    }
}
//fun fraze(origFraze:String):String{
//    //Если фраза содержит слово "невозможно":
//    //Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
//    return when {
//        origFraze.contains("невозможно") -> origFraze.replace(oldValue = "невозможно", newValue = "совершенно точно возможно, просто требует времени", true )
//    else -> ""
//    }


//    val originalFraze = "Это невозможно выполнить за один день"
//    val unw = originalFraze.replace(oldValue = "невозможно", newValue = "совершенно точно возможно, просто требует времени")
//    println(unw)
//    Если фраза начинается с "Я не уверен":
//    Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
