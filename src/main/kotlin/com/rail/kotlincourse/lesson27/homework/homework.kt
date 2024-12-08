package com.rail.kotlincourse.lesson27.homework

import com.rail.kotlincourse.lesson25.homework.lambdaNotType


fun timeTracker(function: () -> List<Int>): Long {
    val nachalo = System.currentTimeMillis()
    val konez = System.currentTimeMillis()
    val skolko = konez - nachalo
    return skolko
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println(timeTracker(myFunction))

    //zadanie 2
    val zadanie2 = Employee("Абоба", 44, "Дворник").apply {
        email = "aboba.Dvornik@sliplas.com"
        department = "Клининг"
    }

    println("zadanie2")
    println("${zadanie2.name}")
    println("${zadanie2.age}")
    println("${zadanie2.position}")
    println("${zadanie2.email}")
    println("${zadanie2.department}")

    //zadanie 3
    val zadanie3 = com.rail.kotlincourse.lesson27.homework.Person("Красивый Абоба", 69).apply {
        email = "pretty.Aboba@FlipFlap.meaw"
    }
    println("zadanie3")
    println(zadanie3.also { prettyInfo(it) })

    //zadanie 4
    val zadanie4 = Person("Черырепалый", 77).apply {
        email = "donatello@4hands.com"
    }
    val s = with(zadanie4) {
        Employee(name = this.name, age = this.age, "бо").apply {
            email = this.email
            department = "драчун"
        }
    }
    println(zadanie4.also { prettyEmployee(s) })

    //zadanie 5


}

fun prettyInfo(person: Person) {
    println("Pretty Info:")
    println("Имечко: ${person.name}")
    println("Годиков: ${person.age}")
    println("Имейлик: ${person.email}")
}

fun prettyEmployee(s: Employee) {
    println("Employee Details:")
    println("Name: ${s.name}")
    println("Age: ${s.age}")
    println("Position: ${s.position}")
    println("Email: ${s.email}")
    println("Department: ${s.department}")
}