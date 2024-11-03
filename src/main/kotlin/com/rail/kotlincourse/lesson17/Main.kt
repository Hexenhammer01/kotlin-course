package com.rail.kotlincourse.lesson17

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class lastMaterial() : Materials() {
    fun extract(): String {
        val extact1 = extractMaterial()
        if (extact1.isEmpty()) {
            return ""
        }
        if (extact1.size == 1) {
            return ""
        }
        for (i in 1 until extact1.size) {
            addMaterial(extact1[i])
        }
        return extact1[0]
    }
}

class secMaterial() : Materials() {
    fun extract(): String {
        val extact1 = extractMaterial()
        if (extact1.isEmpty()) {
            return ""
        }
        if (extact1.size == 1) {
            return ""
        }
        for (i in 0 until extact1.size - 1) {
            addMaterial(extact1[i])
        }
        return extact1.last()
    }
}

class ExtMiddle() : Materials() {
    fun extract(): String {
        val extact1 = extractMaterial()
        if (extact1.size == 1) {
            return ""
        }
        if (extact1.size == 1) {
            return extact1[0]
        }
        val middleIndex = extact1.size/2
        for (i in extact1.indices){
            if (i == middleIndex) continue
            addMaterial(extact1[i])
        }
        return extact1[middleIndex]

    }
}

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val a1 = ExtMiddle()
    ordinalNumbers.forEach { a1.addMaterial(it) }
    println(a1.extract())
    a1.printContainer()
}
