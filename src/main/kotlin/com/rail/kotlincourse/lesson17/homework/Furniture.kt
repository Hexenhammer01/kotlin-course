package com.rail.kotlincourse.lesson17.homework


open class Furniture(
    val material: String,
    val color: String,
    val weight: Int
)

open class Tables(
    material: String, color: String, weight: Int,
    val manufacturer: String
) : Furniture(material, color, weight)

open class Chairs(
    material: String, color: String, weight: Int,
    val back_of_chair: Boolean
) : Furniture(material, color, weight)

class WorkTable(material: String, color: String, weight: Int, val construction: String, manufacturer: String) : Tables(
    material, color, weight,
    manufacturer
)

class homeChairs(
    material: String, color: String, weight: Int,
    back_of_chair: Boolean,
) : Chairs(material, color, weight, back_of_chair)

