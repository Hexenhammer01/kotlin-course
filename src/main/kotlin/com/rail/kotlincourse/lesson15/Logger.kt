package com.rail.kotlincourse.lesson15

import javax.sound.midi.MetaMessage
import javax.xml.crypto.Data

object Logger {

    private var data = 0

    fun log(message: String){
        println("Log: $message and $data")
    }

    fun setData(data: Int){
        this.data = data
    }
}