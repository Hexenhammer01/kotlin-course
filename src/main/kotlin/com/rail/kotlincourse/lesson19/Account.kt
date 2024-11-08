package com.rail.kotlincourse.lesson19

import jdk.jfr.DataAmount

class Account(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }
}