package com.rail.kotlincourse.lesson17.homework



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
class OnBottom(): Materials() {
    fun add(material: String) {
        val add1 = extractMaterial().toMutableList()
        addMaterial(material)
        add1.forEach { addMaterial(it) }
    }
}

class  Index1():Materials() {
    fun add(material: String): String {
        val add1 = extractMaterial().toMutableList()
        val inIndex = add1.size / 2
        if (inIndex == 0) {
        }
        return add1[inIndex]
    }
}



