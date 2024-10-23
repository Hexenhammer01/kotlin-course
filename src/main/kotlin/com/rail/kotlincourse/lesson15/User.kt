package com.rail.kotlincourse.lesson15



data class User(val idn: Int,val name: String)

fun main(){
    val user1= User(1,"Alise")
    val user2 = user1.copy(name = "Bob")

    println(user1)
    println(user2)
}