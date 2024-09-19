package com.rail.kotlincourse.lesson5

(12 / 3 > 3) && (5 * 2 == 10) пример решения: true && true = true
(14 - 4 <= 10) || (6 / 2 != 3) : true или false = true
(9 + 1 == 10) && (8 % 2 == 0) : true и true = true
(7 - 2 < 5) || (4 * 3 != 12) : false или false = false
(18 / 6 >= 3) && (5 + 5 == 10) : true и true = true
(11 % 3 != 2) || (9 - 3 == 6) : false или true = true
(5 * 2 < 11) && (14 / 2 == 7) : true и true = true
(8 + 2 <= 10) || (7 % 2 != 1) : true или false = true
(16 / 4 > 3) && (3 + 4 == 7) : true и true = true
(10 % 2 == 0) || (5 - 3 != 1) : true или true = true;


((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1) : true и false или false = false
((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7) : true или true и true = true
((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0) : true и true или false = true
((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8) : false и false или true = true
((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6) : true или false и false = true;

(var f = 6; --f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5)) : true или (true и false) = true
((var g = 0; g++ != 0) && (4 + 2 == 6)) || (5 / 1 == 5) : (false и true) или true = true
(var h = 7; h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1) : true или true и false = true
((var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5) : (true или false) и true = true
(var j = 4; j-- < 4) && ((6 + 0 == 6) || (5 % 2 != 1)) : false и (true или false) = false


//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
// которая составляет 0,5% от его стоимости.
// В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.
fun main(){
    printDelivery(price = 100)
    printDelivery(price = null)
}

fun printDelivery(price : Int?) {
    if (price != null) {
        println(price * 0.05)
    } else println("50$")
}

//Контекст: Вы проводите метеорологические измерения.
//Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано.
//Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
//Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

fun main(){
    printTemp(temp = "Показатели")
    printTemp(temp = null)
}

fun printTemp(temp : Any?){
    println(temp ?: throw Exception("Отсутствуют показания!"))
}