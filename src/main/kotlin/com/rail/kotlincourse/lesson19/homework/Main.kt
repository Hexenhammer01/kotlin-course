package com.rail.kotlincourse.lesson19.homework

fun main(){

    val refact = ChildrenClass(
        "privateVal",
        "protectedVal",
        "publicVal"
    )
    println(refact.getAll())
    refact.publicField = "Антонио Бандерас"
    refact.refactorProtectField("Изменяю из Main")
    refact.refactPrivateField("Меняю из Main private")
    println(refact.getAll())
    refact.printText()


}
