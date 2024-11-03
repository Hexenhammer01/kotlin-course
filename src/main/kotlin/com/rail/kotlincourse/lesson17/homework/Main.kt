package com.rail.kotlincourse.lesson17.homework
fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val myNumbers = listOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12",
        "13",
        "14",
        "15",
        "16",
        "17",
        "18",
        "19",
        "20"
    )
    val bottom = OnBottom()
    ordinalNumbers.forEach { bottom.addMaterial(it) }
    bottom.add("0000")
    bottom.printContainer()

    val indexx = Index1()
    ordinalNumbers.forEach { indexx.addMaterial(it) }
    indexx.printContainer()



}