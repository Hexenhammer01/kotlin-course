package com.rail.kotlincourse.lesson19.homework



class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    //Потому как он вызывается в Base Class, который является открытым
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    //Потому как она вызывается в BaseClass, а тут все наследуют BaseClass

    // проверь, что выводится на печать при вызове функции printText()

    // и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun refactorProtectField(value: String){
        protectedField = value
    }
}