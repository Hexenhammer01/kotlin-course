package com.rail.kotlincourse.lesson31.homework

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.rail.kotlincourse.lesson31.University
import java.io.File

enum class CharacterTypes {
    CTO,
    TEAMLEAD,
    BACKEND,
    FRONTEND,
    QA,
    DESIGNER
}

data class Employee(
    val name: String,
    val trudStat: Boolean,
    val bornDate: String,
    val characterTypes: CharacterTypes,
    val podch: List<Employee>

)
fun main() {

    val Backend = Employee(
        name = "Копатель Бекендович",
        trudStat = true,
        bornDate = "03-03-1983",
        characterTypes = CharacterTypes.BACKEND,
        podch = emptyList()
    )
    val Frontend = Employee(
        name = "Краситель Кнопкавич",
        trudStat = true,
        bornDate = "04-04-1994",
        characterTypes = CharacterTypes.FRONTEND,
        podch = emptyList()
    )
    val Qa = Employee(
        name = "Ломатель Тестерович",
        trudStat = true,
        bornDate = "05-05-1995",
        characterTypes = CharacterTypes.QA,
        podch = emptyList()
    )
    val Designer = Employee(
        name = "Рисовалка Фигмовна",
        trudStat = true,
        bornDate = "06-06-1996",
        characterTypes = CharacterTypes.DESIGNER,
        podch = emptyList()
    )
    val Teamlead = Employee(
        name = "Лид Тимлиденко",
        trudStat = true,
        bornDate = "02-02-1962",
        characterTypes = CharacterTypes.TEAMLEAD,
        podch = listOf(Backend,Frontend,Qa,Designer)
    )
    val Cto = Employee(
        name = "Василий Пупкин",
        trudStat = true,
        bornDate = "01-01-1956",
        characterTypes = CharacterTypes.CTO,
        podch = listOf(Teamlead)
    )

    val gson: Gson = GsonBuilder().setPrettyPrinting().create()

    val jsonString = gson.toJson(Cto)

    val file = File("CTO.json")
    file.writeText(jsonString)

    println("JSON записан в CTO.json")

    val jsonContent = file.readText()
    println("jsonContent")
    println(jsonContent)
    println("десериализация")
    val revert = gson.fromJson(jsonContent,Employee::class.java)
    println(revert)

}