package com.rail.kotlincourse.lesson18.homeWork18

import com.rail.kotlincourse.lesson18.printColored

class Cat : Animal() {

    override fun makeSound(sound: String) {
        printColored("Meow", Colors.BLUE)
    }
}
