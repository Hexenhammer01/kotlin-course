package com.rail.kotlincourse.lesson31.homework

import org.junit.jupiter.api.Assertions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CerealStorageImplTest {

    private val storage = CerealStorageImpl(10f, 20f)

    @Test
    fun `should throw if containerCapacity is negative`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-4f, 10f)
        }
    }

    @Test
    fun `should throw if storageCapacity is lower than containerCapacity`() {
        Assertions.assertThrows(IllegalArgumentException::class.java, { CerealStorageImpl(10f, 9.9f) })
    }

    @Test
    fun addCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        Assertions.assertEquals(2.2f, getAmount(Cereal.RICE))
    }

    @Test
    fun getCerealTypes1(): Unit = with(storage) {
        Assertions.assertTrue(getCerealTypes().isEmpty())
        addCereal(Cereal.RICE, 2.2f)
        Assertions.assertEquals(listOf(Cereal.RICE), getCerealTypes())
    }

    @Test
    fun addExtraCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        addCereal(Cereal.RICE, 1.3f)
        Assertions.assertEquals(3.5f, getAmount(Cereal.RICE))
    }

    @Test
    fun addMultipleCereal() = with(storage) {
        addCereal(Cereal.RICE, 1.1f)
        addCereal(Cereal.PEAS, 2.7f)
        Assertions.assertAll(
            { Assertions.assertEquals(1.1f, getAmount(Cereal.RICE)) },
            { Assertions.assertEquals(2.7f, getAmount(Cereal.PEAS)) }
        )
    }

    @Test
    fun `should return 0 if container not full`() = with(storage) {
        Assertions.assertEquals(0f, addCereal(Cereal.BUCKWHEAT, 9.9f))
    }

    @Test
    fun `should return rest if added cereal is biggest than container empty space`() = with(storage) {
        Assertions.assertEquals(0.1f, addCereal(Cereal.PEAS, 10.1f), 0.01f)
    }

    @Test
    fun `should throw if cereal amount is negative`(): Unit = with(storage) {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            addCereal(Cereal.RICE, -1f)
        }
    }

    @Test
    fun `should throw when storage don't have space for new container`(): Unit = with(storage) {
        addCereal(Cereal.RICE, 0.1f)
        addCereal(Cereal.PEAS, 0.1f)
        Assertions.assertThrows(IllegalStateException::class.java) {
            addCereal(Cereal.BUCKWHEAT, 0.1f)
        }
    }

    @Test
    fun getCerealToCanDispense(): Unit = with(storage) {
        addCereal(Cereal.RICE, 1.7f)
        Assertions.assertEquals(1.7f,getCereal(Cereal.RICE, 3.7f))
    }

    @Test
    fun getCereal(): Unit = with(storage) {
        addCereal(Cereal.RICE, 6.7f)
        Assertions.assertEquals(3.7f,getCereal(Cereal.RICE, 3.7f))
    }

    @Test
    fun `should not dispense if nothing is available`() = with(storage){
        addCereal(Cereal.RICE, 10.0f)
        getCereal(Cereal.RICE, 10.0f)
        val amountDispensed = getCereal(Cereal.RICE, 1.0f)
        Assertions.assertEquals(0.0f, amountDispensed)
    }

    @Test
    fun




}