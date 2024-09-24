package com.rail.kotlincourse.lesson6
//Задача 1
//fun main(){
//    println(getSeason(season = 345))
//}
//fun getSeason (season:Int):String {
//    return when (season) {
//        in 3 until 6 -> "spring"
//        in 6 until  9 -> "summer"
//        in 9 until 12 -> "autum"
//        12 -> "winter"
//        in 1 until 3 ->"winter"
//        else->"Incorrect"
//    }
//}
//
////Задача 2
//fun HumanAge(dogAge: Int): Double {
//    return if (dogAge <= 2) {
//        dogAge * 10.5
//    } else {
//        2 * 10.5 + (dogAge - 2) * 4
//    }
//}
//
////Задача 3
//fun main(){
//    println(transpotType(transport = 4.9))
//}
//
//fun transpotType (transport:Double):String{
//    return if (transport <1){
//        "пешком"
//    }else if (transport >1 && transport <5){
//        "велосипед"
//    }else {
//        "автотранспорт"
//    }
//}
////Задача 4
//fun main(){
//    println(clientPoints(points=2000))
//}
//
//fun clientPoints(points:Int):Int{
//    return when (points){
//        in 1..1000 -> 2*(points/100)
//        else -> 5*(points/100)
//    }
//}
////Задача 5
//fun main(){
//    println(getSystemFile(file="txt"))
//}
//
//fun getSystemFile(file:String):String{
//    return if (file.equals("txt") ){
//        "Текстовый документ"
//    }else if (file.equals("png")){
//        "Изображение"
//    }else if (file.equals("xls")){
//        "Документ"
//    }else {
//        "Неизвестный тип"
//    }
//}
////Задача 6
////Задача 7
//fun main(){
//    println( outsideTemp(temp=0))
//}
//fun outsideTemp(temp:Int):String{
//    return when(temp){
//        in -30 until  0 -> "Куртка и шорты"
//        in 15 downTo 0 -> "ветровка"
//        in 35 downTo 15 -> "футболка и шорты"
//        else -> "Не выходи из дома"
//    }
//}
////Задача 8
//fun main(){
//    println(movieRate(age=99))
//}
//fun movieRate(age:Int):String{
//    return if (age in 0..6){
//        "детские"
//    }else if (age in 7..17){
//        "подростковые"
//    }else {
//        "18+"
//    }
//}