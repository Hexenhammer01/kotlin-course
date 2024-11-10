package com.rail.kotlincourse.lesson20.homework

import java.io.InputStream

interface Powerable { //включение-выключение
    fun powerOn()
    fun powerOff()
}

interface Openable { //открыто-закрыто
    fun open()
    fun close()
}

interface WaterContainer { //контейнер для воды
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable { //регулятор температуры
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection { //подключение воды
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown { //автоматическое закрываение
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable { //дринаж
    fun connectToDrain()
    fun drain()
}

interface Timable { //расписание
    fun setTimer(time: Int)
}

interface BatteryOperated { //работа от аккума
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical { //механически
    fun performMechanicalAction()
}

interface LightEmitting { //свет
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting { //звук
    fun setVolume(volume: Int)
    fun mute()
   fun playSound(stream: InputStream)
}

interface Programmable { //программируемый
    fun programAction(action: String)
    fun execute()
}

interface Movable { //передвижной
    fun move(direction: String, distance: Int)
}

interface Cleanable { //очищаемый
    fun clean()
}

interface Rechargeable { //перезаряжаемый
    fun getChargeLevel(): Double
    fun recharge()
}