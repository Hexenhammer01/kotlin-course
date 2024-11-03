package com.rail.kotlincourse.lesson18.homeWork18

import com.rail.kotlincourse.lesson18.printColored

abstract class Animal() {
    abstract fun makeSound(sound: String)
    open fun makeSound (sound: String, color: String){
        printColored("This animal makes no sound.", color)
    }

}