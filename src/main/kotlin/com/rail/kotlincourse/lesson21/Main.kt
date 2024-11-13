package com.rail.kotlincourse.lesson21

class BoxAny(private val item: Any) {

    fun getItem(): Any {
        return item
    }
}

class Box<Яблоки, Помидоры>(private val item: Яблоки, private val item2: Помидоры) {
    fun getItem(): Яблоки {
        return item
    }

    fun getItem2(): Помидоры {
        return item2

    }
}

fun main() {
    val appleBoxAny = BoxAny("Applr")
    val intBoxAny = BoxAny("43")

    println("В коробке ${appleBoxAny.getItem()}")
    println("${intBoxAny.getItem()}")

//    val appleBox: Box<String> = Box("Apple")
//    val intBox: Box<Int> = Box(45)

    println("В коробке ${appleBoxAny.getItem()}")
    println("${intBoxAny.getItem()}")

//    appleBox.getItem().length
    printItem("hello")
    printItem(123)
    printItem(3.534F)

    println(sum(5, 7F))
    println(sum(5, 4))
}

fun <T> printItem(item: T): T {
    println("Элемент $item")
    return item
}

fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}


class GenericIterator<T : Number, R : Iterable<T>>(
    private val argument: T,
    private val elements: R
) {
    fun printEl() {
        for (e in elements) {
            println(
                e.toString()
                    .repeat(argument.toInt())
            )
        }
    }
}

class Conteiner<C>(
    private val item: C
)

class PairBox<A, B>(
    val firt: A,
    val second: B
)

class LimitedCont<Q : Number>(
    val item: Q?
)

interface Storage<Q> {
    fun set(item: Q)
    fun get(): Q
}

interface Transformer<Q, W> {
    fun pr(item: Q): W
}

//fun <Q> swap(list: List<Q>, index1: Int, index2: Int): List<Q> {}
//
//fun <W> second(list1: List<W>, list2: List<W>): List<W> {}
//
//fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {}