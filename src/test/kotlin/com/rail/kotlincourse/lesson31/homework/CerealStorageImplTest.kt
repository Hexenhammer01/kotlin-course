package com.rail.kotlincourse.lesson31.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertTrue

import org.junit.jupiter.api.Test

class CerealStorageImplTest {

    private val storage = CerealStorageImpl(10f, 20f)

    //Если отрицательное значение
    @Test
    fun `should throw if containerCapacity is negative`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-4f, 10f)
        }
    }

    //Если емкость хранилища меньше контейнера
    @Test
    fun `should throw if storageCapacity is lower than containerCapacity`() {
        Assertions.assertThrows(IllegalArgumentException::class.java, { CerealStorageImpl(10f, 9.9f) })
    }

    //Добавление зерна
    @Test
    fun addCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        Assertions.assertEquals(2.2f, getAmount(Cereal.RICE))
    }

    @Test
    fun getCerealTypes1(): Unit = with(storage) {
        assertTrue(getCerealTypes().isEmpty())
        addCereal(Cereal.RICE, 2.2f)
        Assertions.assertEquals(listOf(Cereal.RICE), getCerealTypes())
    }

    //Добавление зерна несколько раз
    @Test
    fun addExtraCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        addCereal(Cereal.RICE, 1.3f)
        Assertions.assertEquals(3.5f, getAmount(Cereal.RICE))
    }

    //Добавление разного зерна
    @Test
    fun addMultipleCereal() = with(storage) {
        addCereal(Cereal.RICE, 1.1f)
        addCereal(Cereal.PEAS, 2.7f)
        Assertions.assertAll(
            { Assertions.assertEquals(1.1f, getAmount(Cereal.RICE)) },
            { Assertions.assertEquals(2.7f, getAmount(Cereal.PEAS)) }
        )
    }

    //Возвращает 0 если контейнер не заполнен
    @Test
    fun `should return 0 if container not full`() = with(storage) {
        Assertions.assertEquals(0f, addCereal(Cereal.BUCKWHEAT, 9.9f))
    }

    //Возвращает остаток, если добавленная крупа больше, чем пустое пространство контейнера
    @Test
    fun `should return rest if added cereal is biggest than container empty space`() = with(storage) {
        Assertions.assertEquals(0.1f, addCereal(Cereal.PEAS, 10.1f), 0.01f)
    }

    //Если количество крупы отрицательно
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
        Assertions.assertEquals(1.7f, getCereal(Cereal.RICE, 3.7f))
    }

    //корректно работает отдача
    @Test
    fun getCereal(): Unit = with(storage) {
        addCereal(Cereal.RICE, 6.7f)
        Assertions.assertEquals(3.7f, getCereal(Cereal.RICE, 3.7f))
    }

    //нечего выдавать когда ничего нет
    @Test
    fun `should not dispense if nothing is available`() = with(storage) {
        addCereal(Cereal.RICE, 10.0f)
        getCereal(Cereal.RICE, 10.0f)
        val amountDispensed = getCereal(Cereal.RICE, 1.0f)
        Assertions.assertEquals(0.0f, amountDispensed)
    }

    //выбрасывает ошибку когда значение отрицательное
    @Test
    fun `should throw IllegalArgumentException if amount is negative`(): Unit = with(storage) {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            getCereal(Cereal.RICE, -5.0f)
        }
    }

    @Test
    fun `should return available amount if requested more than available`() = with(storage) {
        addCereal(Cereal.RICE, 10.0f)
        val amountDispensed = getCereal(Cereal.RICE, 15.0f)
        Assertions.assertEquals(10.0f, amountDispensed)
    }

    @Test
    fun `should return available amount if requested more than available1`() = with(storage) {
        addCereal(Cereal.RICE, 10.0f)
        addCereal(Cereal.PEAS, 1.7f)
        val amountDispensedRice = getCereal(Cereal.RICE, 15.0f)
        val amountDispensedPeas = getCereal(Cereal.PEAS, 3.0f)
        Assertions.assertEquals(10.0f, amountDispensedRice)
        Assertions.assertEquals(1.7f, amountDispensedPeas)
    }

    @Test
    fun `remove empty container`() = with(storage)  {
        addCereal(Cereal.PEAS, 14f)
        getCereal(Cereal.PEAS, 14f)
        assertTrue(removeContainer(Cereal.PEAS))
    }


}