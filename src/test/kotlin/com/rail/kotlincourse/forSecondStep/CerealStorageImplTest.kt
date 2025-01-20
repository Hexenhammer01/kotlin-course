package com.rail.kotlincourse.forSecondStep


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class CerealStorageImplTest {

    private val storage = CerealStorageImpl(10f, 20f)

    //Если отрицательное значение
    @Test
    fun `should throw if containerCapacity is negative`() {
        val message = assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-4f, 10f)
        }
        assertEquals("Ёмкость контейнера не может быть отрицательной", message.message)
    }

    //Если емкость хранилища меньше контейнера
    @Test
    fun `should throw if storageCapacity is lower than containerCapacity`() {
        assertThrows(IllegalArgumentException::class.java, { CerealStorageImpl(10f, 9.9f) })
    }

    //Добавление зерна
    @Test
    fun addCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        assertEquals(2.2f, getAmount(Cereal.RICE))
    }


    //Добавление зерна несколько раз
    @Test
    fun addExtraCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        addCereal(Cereal.RICE, 1.3f)
        assertEquals(3.5f, getAmount(Cereal.RICE))
    }

    //Добавление разного зерна
    @Test
    fun addMultipleCereal() = with(storage) {
        addCereal(Cereal.RICE, 1.1f)
        addCereal(Cereal.PEAS, 2.7f)
        assertAll(
            { assertEquals(1.1f, getAmount(Cereal.RICE)) },
            { assertEquals(2.7f, getAmount(Cereal.PEAS)) }
        )
    }

    //Возвращает 0 если контейнер не заполнен
    @Test
    fun `should return 0 if container not full`() = with(storage) {
        assertEquals(0f, addCereal(Cereal.BUCKWHEAT, 9.9f), 0.01f)
    }

    //Возвращает остаток, если добавленная крупа больше, чем пустое пространство контейнера
    @Test
    fun `should return rest if added cereal is biggest than container empty space`() = with(storage) {
        assertEquals(0.5f, addCereal(Cereal.PEAS, 10.5f), 0.01f)
    }

    //Если количество крупы отрицательно
    @Test
    fun `should throw if cereal amount is negative`(): Unit = with(storage) {
        assertThrows(IllegalArgumentException::class.java) {
            addCereal(Cereal.RICE, -1f)
        }
    }

    //нет места для нового контейнера
    @Test
    fun `should throw when storage don't have space for new container`() {
        val storage = CerealStorageImpl(1f, 1f)
        storage.addCereal(Cereal.RICE, 1f)
        assertThrows(IllegalStateException::class.java) {
            storage.addCereal(Cereal.BUCKWHEAT, 11f)
        }
    }

    //Нельзя забрать больше чем есть
    @Test
    fun getCerealToCanDispense(): Unit = with(storage) {
        addCereal(Cereal.RICE, 1.7f)
        assertEquals(1.7f, getCereal(Cereal.RICE, 3.7f))
    }

    //корректно работает отдача
    @Test
    fun getCereal(): Unit = with(storage) {
        addCereal(Cereal.RICE, 6.7f)
        assertEquals(3.7f, getCereal(Cereal.RICE, 3.7f))
    }

    //нечего выдавать когда ничего нет
    @Test
    fun `should not dispense if nothing is available`() = with(storage) {
        addCereal(Cereal.RICE, 10.0f)
        getCereal(Cereal.RICE, 10.0f)
        val amountDispensed = getCereal(Cereal.RICE, 1.0f)
        assertEquals(0.0f, amountDispensed)
    }

    //Выбрасывает ошибку когда значение отрицательное
    @Test
    fun `should throw IllegalArgumentException if amount is negative`(): Unit = with(storage) {
        assertThrows(IllegalArgumentException::class.java) {
            getCereal(Cereal.RICE, -5.0f)
        }
    }

    //Вернуть доступную сумму, если запрошено больше, чем доступно
    @Test
    fun `should return available amount if requested more than available`() = with(storage) {
        addCereal(Cereal.RICE, 10.0f)
        val amountDispensed = getCereal(Cereal.RICE, 15.0f)
        assertEquals(10.0f, amountDispensed)
    }

    //Вернуть доступную сумму, если запрошено больше, чем доступно, несколько круп
    @Test
    fun `should return available amount if requested more than available multiple croupes`() = with(storage) {
        addCereal(Cereal.RICE, 10.0f)
        addCereal(Cereal.PEAS, 1.7f)
        val amountDispensedRice = getCereal(Cereal.RICE, 15.0f)
        val amountDispensedPeas = getCereal(Cereal.PEAS, 3.0f)
        assertAll(
            { assertEquals(10.0f, amountDispensedRice) },
            { assertEquals(1.7f, amountDispensedPeas) }
        )
    }

    //Забор нескольких круп
    @Test
    fun `correctness of intake of several types of cereals`() = with(storage) {
        addCereal(Cereal.RICE, 10f)
        addCereal(Cereal.PEAS, 4f)

        getCereal(Cereal.RICE, 5f)
        getCereal(Cereal.PEAS, 2f)
        assertAll(
            { assertEquals(5f, getAmount(Cereal.RICE), 0.01f) },
            { assertEquals(2f, getAmount(Cereal.PEAS), 0.01f) }
        )
    }

    //Удаление пустого контейнера
    @Test
    fun `remove empty container`() = with(storage) {
        addCereal(Cereal.PEAS, 14f)
        getCereal(Cereal.PEAS, 14f)
        assertTrue(removeContainer(Cereal.PEAS))
    }

    //Нельзя удалить если контейнер не пуст
    @Test
    fun `cannot delete a container if it is not empty`() = with(storage) {
        addCereal(Cereal.RICE, 10f)
        assertFalse(removeContainer(Cereal.RICE))
    }

}