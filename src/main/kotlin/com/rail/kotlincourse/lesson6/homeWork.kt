package com.rail.kotlincourse.lesson6
//Задача 1
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

//Задача 2
fun HumanAge(dogAge: Int): Double {
    return if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        2 * 10.5 + (dogAge - 2) * 4
    }
}

//Задача 3
fun main(){
    println(transpotType(transport = 4.9))
}

fun transpotType (transport:Double):String{
    return if (transport <1){
        "пешком"
    }else if (transport >1 && transport <5){
        "велосипед"
    }else {
        "автотранспорт"
    }
}