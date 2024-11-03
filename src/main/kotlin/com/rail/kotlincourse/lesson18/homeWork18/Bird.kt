package com.rail.kotlincourse.lesson18.homeWork18

import com.rail.kotlincourse.lesson18.printColored

class Bird : Animal() {
    override fun makeSound(sound:String) {
        printColored("Tweet", Colors.RED)
    }
}