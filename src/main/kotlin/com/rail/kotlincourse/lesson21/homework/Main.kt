package com.rail.kotlincourse.lesson21.homework

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val map1 = mutableMapOf<K, V>()
    for (i in keys.indices) {
        if (i >= values.size) {
            break
        } else
        map1[keys[i]] = values[i]
    }
    return map1

}

fun <T> getMiddleElement (list: List<T>) : T? {
    if (list.isEmpty()) {
        println("Список пустой")
    }
    val middle = list.size / 2
    return list[middle]
}


fun main() {
    val keys = listOf("1", "2", "3",)
    val values = listOf(1, 2, 3, 4)

    val map = toMap(keys, values)
    println(map)

    val middle1 = listOf("1",2,'3',4f)
    println(getMiddleElement(middle1))
}