package com.rail.kotlincourse.lesson15.homework

class Emotion(var type: String, var intensity: Int) {

    fun express() {
        val express1 = when (intensity){
            in 1..5 -> "weak"
            in 6..10 -> "moderate"
            in 11..1000 -> "strong"
            else -> "I don't now"
        }
        println("You $type  and you express $express1")
    }
}