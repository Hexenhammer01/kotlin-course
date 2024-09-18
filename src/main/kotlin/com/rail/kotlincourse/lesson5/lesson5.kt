package com.rail.kotlincourse.lesson5

fun main() {
    val sum = 10 + 5
//    val sum = "5"+"5" канкотинация
    val diff = 10 - 5
    val  product = 10 * 5
    val quotient = 10 / 5
    val remainder = 10 % 6
    val isEqual = (5 == 5) //сравнение двух значений, ответ - булевое значение
    val  isNotEqual = (5 != 5) //сравнение не равно , ! не
    val isGreater = (5 > 4)
    val isLesser = (5 < 4)
    val isGreaterOrEqual = (5 >= 5)
    val isLesserOrEqual = (5 <= 3)
    val andResult = (5 > 3) && (5 > 4) //true && true, оператор && "и"
    val orResult = (5 > 3) || (5 < 4)  //оператор || "или", true или false вернет true
    val notResult = !(5 > 3) //переворачивает значение , было true, стало false
    val number = 5 // "=" присваивание, присваивание с увеличением number + 3 пишется как number +=3, с "-" тоже самое
    // также работает с умножением и делением

    // Операторы инкримента и дикримента
    // нужны чтобы имеющуюся изменяемую переменную увеличить или уменьшить на единицу
    println(number++) // увеличит на единицу
    println(number--) // уменьшает на единицу
    // если инкремент до переменной, то сначала увеличится/уменьшится на единичку а потом получение результата    println(++number)
    //сначала вычисления, потом операции!!!

}