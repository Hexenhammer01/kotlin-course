package com.rail.kotlincourse.lesson15.homework

class Concert(var group: String, var place: String, var price: Double, var hallCapacity: Int) {
    private val sellTickets: Int = 0

    fun info() {
        println("Info: $group band, $place place, price = $price  ")
    }

}