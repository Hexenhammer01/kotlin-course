package com.rail.kotlincourse.lesson15.homework

import java.security.Principal

fun main (){
    val party = Party("Moscow",1000)
    party.details()
    val result = Emotion("Happy", 40)
    result.express()

    Moon.isVisible = true
    Moon.phase = "New Moon"
    Moon.showPhase()





}
