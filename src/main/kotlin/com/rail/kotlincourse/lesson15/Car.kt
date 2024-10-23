package com.rail.kotlincourse.lesson15

class Car(val model:String,val brand:String) {
    companion object {
        val carList = listOf("a","w","e","r","t","y")
    }
        fun aboutCar(){
        println("I am $brand and $model")
    }

}