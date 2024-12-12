package com.rail.kotlincourse.lesson27.homework

import com.rail.kotlincourse.lesson25.homework.lambdaNotType


fun timeTracker(function: () -> Any): Long {
    val nachalo = System.currentTimeMillis()
    function()
    val konez = System.currentTimeMillis()
    val skolko = konez - nachalo
    return skolko
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println("Задание 1")
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
    val zadanie3 = Person("Красивый Абоба", 69).apply {
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
            department = "драчун"
            email = this@with.email
        }
    }
    println("zadanie4")
    println(zadanie4.also { prettyEmployee(s) })

    //zadanie 5
    val zadanie5 = Person("Абиба", 77).run {
        Employee(name, age, "Балбес").apply {
            department = "2 Балбеса"
            email = "firstBalbes@gmail.com"
        }

    }
    println(prettyEmployee(zadanie5))

    //zadanie 6
    val zadanie6 = Person("Биба", 99)
    fun zadanie61(z: Person?): Employee? = z?.let {
        Employee(it.name, it.age, "Балбес").apply {
            email = "secondBalbes@gmail.com"
            department = "2 балбеса"
        }
    }
//    println(zadanie61.also { prettyEmployee(s) })

}


fun prettyInfo(r: Person) {
    println("Pretty Info:")
    println("Имечко: ${r.name}")
    println("Годиков: ${r.age}")
    println("Имейлик: ${r.email}")
}

fun prettyEmployee(s: Employee) {
    println("Employee Контакты:")
    println("Имя: ${s.name}")
    println("Лет: ${s.age}")
    println("Позиция: ${s.position}")
    println("Email: ${s.email}")
    println("Департамент: ${s.department}")
}