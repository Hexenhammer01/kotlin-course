package com.rail.kotlincourse.lesson22

fun main() {
    val result = "String with spaces".removeSpaces()
    println(result)

    val s: List<Int?> = listOf(1, null)
    s.isElementNullOrEmpty()

    println("qwe".funA("asd", 5))
    println(listOf(1, 2, 34, 5).funB(null))
    mapOf("q" to 1, "w" to 2).funC("c", 2)
    var doooble: Double? = null
    if (doooble != null) {
        println(doooble.funD(4.3, "sdfsdf"))
    }
    println(setOf("zxc", "zxc").funE("vbn"))


    fun Double.format(): String {
        return "%.2f".format(this)
    }


    var dlinnnaya: Double = 58.456456456
    println("%.2f".format(dlinnnaya))
    print(dlinnnaya.format())


    fun String.counter():Int{
        return split(" ").size
    }

    var predl:String= "qwe asd zxc"

    println(predl.split(" ").size)
    println(predl.counter())

    fun <T> T.createList(n:Int):List<T>{
        return (0 until n).map { this }
    }

    var obj=456
    var obj2 = listOf(obj)
    var obj3 = listOf(obj,obj2)

    println(obj3.createList(8).get(0).toString())
}

fun String.removeSpaces(): String {
    return replace(" ", "")
}

fun <T> List<T?>.isElementNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}


fun String.funA(arg1: String, arg2: Int): Boolean {
    return true
}

fun List<Int>.funB(arg: String?) {

}

fun <K, V> Map<K, V>.funC(arg1: K, arg2: V): Boolean {
    return true
}

fun Double.funD(arg1: Double, arg2: String?): Double {
    return 1.4
}

fun <T> Set<T>.funE(arg1: T): List<T> {
    return listOf()
}

