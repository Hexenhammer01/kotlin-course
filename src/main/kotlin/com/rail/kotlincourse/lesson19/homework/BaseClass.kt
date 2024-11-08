package com.rail.kotlincourse.lesson19.homework

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    //Потому как ChildrenClass - открытый класс
    private val privateVal: String,
    // объясни, почему это поле недоступно в main()
    //Потому как оно защищенное и его можно посмотреть только в BaseClass
    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"
    fun refactPrivateField(value: String){
        privateField = value
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // объясни, почему эта функция не может быть публичной
    //Потому как функция возвращает значение класса статусом защищенный
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected
    //Потому как она возвращает значение приватного класса, и не должно быть публичным
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}

