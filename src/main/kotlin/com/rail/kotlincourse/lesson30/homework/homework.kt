package com.rail.kotlincourse.lesson30.homework

fun main() {
    println(zadanie2())

    val lambda1 = {
        println("ПАСС")
    }

    val lambda2 = {
        println("AssertionError")
        assert(false)
    }

    val lambda3 = {
        println("Другое исключение")
        throw Exception("Это другое исключение")
    }

    println("${zadanie3(lambda1)}")
    println("${zadanie3(lambda2)}")
    println("${zadanie3(lambda3)}")
}

enum class TestStatus {
    PASS,
    BROKEN,
    FAILURE
}

enum class Property(
    val propertyName: String
) {
    ROOM("КОМНАТА"),
    T1("ОДНУШКА"),
    TOWNHOUSE("ТАУНХАУС"),
    DUPLEX("ДВУХЭТАЖНАЯ КВАРТИРА")
}

enum class Planets(
    val Rasstoyanie: Double,
    val Ves: Double
) {
    MERCURY(0.387, 3.302e24),
    VENUS(0.723, 4.869e24),
    EARTH(1.0, 5.97e24),
    MARS(1.524, 6.419e23),
    JUPITER(5.203, 1.899e27),
    SATURN(9.582, 5.685e26),
    URANUS(19.18, 8.681e25),
    NEPTUNE(30.07, 1.024e26)

}

fun zadanie2() {
    val sortedTypes = Property.entries.sortedBy { it.propertyName.length }
    for (type in sortedTypes) {
        println(type.propertyName)
    }
}

fun zadanie3(testLambda: () -> Unit): TestStatus {
    var status: TestStatus = TestStatus.PASS
    try {
        testLambda()
    } catch (e: AssertionError) {
        status = TestStatus.FAILURE
    } catch (e: Exception) {
        status = TestStatus.BROKEN
    }
    return status
}
