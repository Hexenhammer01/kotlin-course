package com.rail.kotlincourse.lesson20.homework

abstract class SwitchOnOff : Powerable {
    private var On = true
    override fun powerOn() {
        On = true
        println("Swith On")
    }

    override fun powerOff() {
        println("Swith Off")
        On = false
    }

    protected fun isPowerOn(): Boolean {
        return On
    }
}