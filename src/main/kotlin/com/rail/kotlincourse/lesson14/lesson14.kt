package com.rail.kotlincourse.lesson14

fun main() {

    val fruitsPrice = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrice.entries) {
        println("Key : ${entry.key}, Value: ${entry.value}")
    }
    for ((fruit, price) in fruitsPrice.entries) { //Деструктуризация
        println("Key : ${fruit}, Value: ${price}")
    }

    val entries = fruitsPrice.entries

    val keys = fruitsPrice.keys

    val values = fruitsPrice.values

    val priceOfPearOrElse = fruitsPrice.getOrElse("pear") { throw IllegalArgumentException() }

    val priceOfApple = fruitsPrice.getValue("apple")

    val priceOfPearOrDefault = fruitsPrice.getOrDefault("pear", 0.0)

    val fruitsWithPineapple = fruitsPrice + ("pineapple" to 3.5)

    val mutableFruits = fruitsPrice.toMutableMap()

    mutableFruits["kiwi"] = 2.75 // Добавление элемента

    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9))

    mutableFruits.remove("apple") // Удаление элемента

    mutableFruits.clear()

    val containsApple = fruitsPrice.containsKey("apple")

    val containsValue1_5 = fruitsPrice.containsValue(1.5)

    val isEmpty = fruitsPrice.isEmpty()

    val isNotEmpty = fruitsPrice.isNotEmpty()

    val areAllFruitsExpensive = fruitsPrice.all { it.value > 1.0 }

    val isAnyFruitCheap = fruitsPrice.any { it.value < 1.0 }

    val filteredByPrice = fruitsPrice.filter { it.value > 1.0 }

    val filteredByKeys = fruitsPrice.filterKeys { it.startsWith("a") }

    val filteredByValues = fruitsPrice.filterValues { it < 2.0 }

    val filteredNotApple = fruitsPrice.filterNot { it.key == "apple" }val countExpensiveFruits = fruitsPrice.count { it.value > 1.5 }

    val increasedPrices = fruitsPrice.mapValues { it.value * 1.1 }

    val fruitNamesUppercase = fruitsPrice.mapKeys { it.key.uppercase() }

    val fruitsList = fruitsPrice.map { "${it.key} costs ${it.value}" }








}