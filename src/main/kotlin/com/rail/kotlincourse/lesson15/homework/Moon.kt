package com.rail.kotlincourse.lesson15.homework

object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Phase Moon: $phase")
        } else {
            println("The Moon not visible")
        }
    }
}
