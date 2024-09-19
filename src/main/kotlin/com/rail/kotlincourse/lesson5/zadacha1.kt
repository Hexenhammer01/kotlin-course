package com.rail.kotlincourse.lesson5

import com.rail.kotlincourse.lesson4.printMessage
import org.intellij.lang.annotations.Language

//fun main(){
//    printPrice(price = 12.59, s = null)
//    printPrice(price = 100.0, s = 30)
//}
//
//fun printPrice(price : Double, s : Int? ){
//    val koef = (100 - (s?:0))/100.0
//    println(price * koef)
//}
//fun main(){
//    printLanguage(lang = "Rus")
//    printLanguage(lang = null)
//}

fun printLanguage(lang : String?){
    val defaultLanguage: String = "Eng"
    println(lang?:defaultLanguage)
}

//fun main(){
//    printbox(box = "Rus")
//    printbox(box = null)
//}

fun printbox(box : Any?){
   println(box ?: throw Exception("Box empty"))
}


//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
// которая составляет 0,5% от его стоимости.
// В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.
//fun main() {
//    printPrice(price = null, s = 0.5)
//    printPrice(price = 100.0,s = 0.5)
//}
//
//fun printPrice(price:Double?,s:Double){
//    val koef = (100.0 - 0.5)/100.0
//    val fix =
////    if (price == null) {
////        println("Стандартная стоимость 50$")
////    }else {
//        println((price!! * koef)?: throw ("Стандартная стоимость 50$"))
//}

//fun main(){
//    printTemp(temp = "Показатели")
//    printTemp(temp = null)
//}
//
//fun printTemp(temp : Any?){
//    println(temp ?: throw Exception("Отсутствуют показания!"))
//}

fun main(){
    printDelivery(price = 100)
    printDelivery(price = null)
}

fun printDelivery(price : Int?) {
    if (price != null) {
        println(price * 0.05)
    } else println("50$")
}