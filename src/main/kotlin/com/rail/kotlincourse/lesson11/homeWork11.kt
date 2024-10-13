package com.rail.kotlincourse.lesson11

import com.rail.kotlincourse.lesson4.keyValues
import com.rail.kotlincourse.lesson4.printMessage

fun main() {


    val emptyMapInt: Map<Int, Int> = mapOf<Int, Int>()
    val Map1 = mutableMapOf(
        4.37463F to "erte",
        2345235.5F to "ert"
    )
    Map1[346534.3F] = "dfbdfb"

    val map2 = Map1[346534.3F]
    println(map2)

    val map3 = Map1[6758.7F]
    println(map3)

    Map1.remove(4.37463F)
    println(Map1)

    val MapD = mapOf(
        4.4 to 5,
        6.3 to 1,
        5.2 to 0,
        0.0 to 0
    )


    for ((key, value) in MapD) {
        if (value == 0) {
            println("Бесконечность")
        } else {
            key / value
            println(key / value)
        }
    }

    val pere = mutableMapOf(
        5 to "qwe",
        6 to "rty",
        7 to "asd",
    )
    pere[6] = "zxc"
    println(pere)

    val slov = mutableMapOf(
        "q" to "й",
        "w" to "ц",
        "e" to "у"
    )
    val slov1 = mutableMapOf(
        "a" to "ф",
        "s" to "ы",
        "d" to "в"
    )
    val slov2 = mutableMapOf<String, String>()
    for ((key, value) in slov) {
        slov2[key] = value
    }
    for ((key, value) in slov1) {
        slov2[key] = value
    }
    println(slov2)

    val sloj = mutableMapOf(
        "q" to listOf(1, 2, 3),
        "w" to listOf(4, 5, 6)

    )
    sloj["e"] = listOf(7, 8, 9)
    println(sloj)

    val ksch = mutableMapOf(
        9 to mutableSetOf("q", "w", "e"),
        8 to mutableSetOf("a", "s", "d")
    )
    ksch[8]?.add("v")
    println(ksch)

    val map5: Map<Pair<Int, Int>, Int> = mapOf(
        Pair(1, 2) to 1,
        Pair(3, 4) to 2,
        Pair(5, 6) to 3,
        Pair(7, 8) to 4,
        Pair(9, 10) to 5,
        Pair(11, 12) to 6
    )

    for ((key, value) in map5) {
        val (a, b) = key
        if (a == 5 || b == 5) {
            println(key)
        }
    }

    val books: MutableMap<String, MutableSet<String>> = mutableMapOf(
        "Мураками" to mutableSetOf<String>("Призрачный лес", "Охота на овец", "Кафка на пяже"),
        "Хемингуэй" to mutableSetOf<String>("Старик и море", "Райский сад", "Прощай, оружие")
    )

    println(books)

    val plants: Map<String, List<String>> = mapOf(
        "Фрукты" to listOf<String>("Яблоня", "Груша", "Айва"),
        "Овощи" to listOf<String>("Баклажан", "Томат", "Картофель")
    )

    println(plants)

    val teams: MutableMap<String, MutableList<String>> = mutableMapOf(
        "TeamSpiritGo" to mutableListOf<String>("Donk", "sh1ro", "chopper", "magixx", "zont1x"),
        "Vitality" to mutableListOf<String>("mezii", "flameZ", "Spinx", "ZywOo", "apEX")
    )

    println(teams)

    val places: Map<String, Map<String, List<String>>> = mapOf(
        "Абхазия" to mapOf(
            "Новый Афон" to listOf("Новоафонский мужской монастырь"),
            "Гагры" to listOf("Озеро Рица","Голубое озеро"),

        ),
        "Чили" to mapOf(
            "Атакама" to listOf("Рука пустыни"),
            "Сантьяго" to listOf("Сан-Альфонсо-дель-Мар"),
            "Остров Пасхи" to listOf("Остров Пасхи")

        ))

    println(places)


}