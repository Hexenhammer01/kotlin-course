package com.rail.kotlincourse.lesson31

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalcTest{

    @Test
    fun plus(){

        val ca= Calc()
        val result = ca.plus(2,3)
        Assertions.assertEquals(result,6)
    }
}