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


    val concert1 = Concert("Slipknot", "Arena", 457.7, 1000)
    concert1.info()
    concert1.freTickets()
    concert1.info()





}
