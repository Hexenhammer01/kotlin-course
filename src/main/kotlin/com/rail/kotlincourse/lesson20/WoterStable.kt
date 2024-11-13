package com.rail.kotlincourse.lesson20

import jdk.jfr.DataAmount

interface WoterStable {

    val volume: Double
    fun fill(amount: Double)
    fun take(amount: Double)
}