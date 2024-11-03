package com.rail.kotlincourse.lesson18.homeWork18


class Dog : Animal() {

    override fun makeSound(sound: String) {
        makeSound("Bark", Colors.BLUE)
    }

}