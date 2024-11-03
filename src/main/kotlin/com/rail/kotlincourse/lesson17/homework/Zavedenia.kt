package com.rail.kotlincourse.lesson17.homework

open class Zavedenia(
    val name: String, //Название заведения
    val address: String, //Адрес заведения
    val profiles: String, //Какой профиль у заведения
    val countStudents: Int //Количество студентов
)

open class School(name: String, address: String, profiles: String, countStudents: Int) : Zavedenia(
    name, address, profiles, countStudents
)

open class University(name: String, address: String, profiles: String, countStudents: Int) :
    Zavedenia(name, address, profiles, countStudents)

class SportSchool(name: String, address: String, profiles: String, countStudents: Int, val sportName: String) :
    School(name, address, profiles, countStudents)

class SpecializationUniversity(
    name: String,
    address: String,
    profiles: String,
    countStudents: Int,
    val subject: String
) : University
    (name, address, profiles, countStudents)