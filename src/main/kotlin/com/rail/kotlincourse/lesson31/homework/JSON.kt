package com.rail.kotlincourse.lesson31.homework

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