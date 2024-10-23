package com.rail.kotlincourse.lesson15

fun main(){
    val person = Person("John")
    person.sayHello()
    println(person)
    Logger.setData(6)
    Logger.log("ggwp")
    val result = Calculator.add(14,34)
    println(result)
    Calculator.Version
    var  lamp1 = Lamp(true)
    lamp1.switchON()
    var wind = Wind(100)
    println("${wind.convertSpeed()} m/s"  )
    var car1 = Car(Car.carList[3],"f")
    car1.aboutCar()
}

