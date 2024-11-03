package com.rail.kotlincourse.lesson17.homework

open class Geometry(
    val param1: Int?,
    val param2: Int?,
    val param3: Int?

)

open class Cirle(
    param1: Int?, param3: Int?, param2: Int?, val radius: Double, pi: Double
) : Geometry(param2, param1, param3)

open class Triangle(
    param1: Int?, param2: Int?, param3: Int?,
    val corners : Double
) : Geometry(param1, param2, param3)

class Polygon(
    param1: Int?,param2: Int?,param3: Int?, corners: Double, val param4:Double
):Triangle(param1,param2,param3, corners)

