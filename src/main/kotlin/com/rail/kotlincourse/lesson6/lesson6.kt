package com.rail.kotlincourse.lesson6

//fun main() {
//    val number = getNumber()
//    if (number > 5) {
//        println("Число больше 5")
//    }else {
//        println("Число меньше или равно 5")
//    }
//}

// Диапозон intRange

//fun main() {
//    val intRange: IntRange = 1..10
//    val intRangeUntil = 1 until 10
//    val downTo = 10 downTo 1
//    val charRange: CharRange = 'a'..'z'
//
//    val inRange = 2 in intRange
//    val notInRange = 2 !in intRange
//
//   val score = 95
//    val result = when (score){
//        in 90..100-> "Отлично"
//        in 80..89-> "Хорошо"
//        in 70..79-> "Удовлетворительно"
//        else -> "Нужно подучить"
//    }
//    println(result)

//
//fun getTimesOfDay (hour:Int):String {
//    return when {
//        hour<0||hour>23 -> "Неверно"
//        hour in 0..4 ->"Ночь"
//        hour in 5..11 -> "Утро"
//        hour in 12..16 ->"День"
//        else -> "Вечер"
//    }
//}

//fun getPassword (password: String): Boolean{
//    return when {
//        password.length <= 8 || password.isEmpty() -> false
//        checkSymbol(password) -> true
//        else -> false
//    }
//
//}
//fun checkSymbol (password:String):Boolean{
//    return false
//}
//
//fun getRate (rate:Int): String{
//    return when (rate) {
//        in 0..20 -> "f"
//        in 21..40 -> "e"
//        in 41..60 -> "d"
//        in 61..80 -> "c"
//        in 81..90 -> "b"
//        in 91..100 -> "a"
//        else -> "invalid rate"
//    }
//}


fun main(){
    println(getSeason(season = 345))
}
fun getSeason (season:Int):String {
    return when (season) {
        in 3 until 6 -> "spring"
        in 6 until  9 -> "summer"
        in 9 until 12 -> "autum"
        12 -> "winter"
        in 1 until 3 ->"winter"
        else->"Incorrect"
    }
}

fun humanYears(dogYear: Int):Double{
    return if (dogYear in 1..2) {
        humanYears(dogYear * 10.5)
    }else if (dogYear in 3..10 ) {
        humanYears( * 10.5 + (dogYear -2)*4)
    }else {
        "incorrect"
    }

}