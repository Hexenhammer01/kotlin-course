package com.rail.kotlincourse.lesson31.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class Cereal1StorageImpl1Test1 {

    private val storage = CerealStorage1Impl1(10f, 20f)

    //Если отрицательное значение
    @Test
    fun `should throw if containerCapacity is negative`() {
        val message = assertThrows(IllegalArgumentException::class.java) {
            CerealStorage1Impl1(-4f, 10f)
        }
        assertEquals("Ёмкость контейнера не может быть отрицательной", message.message)
    }

    //Если емкость хранилища меньше контейнера
    @Test
    fun `should throw if storageCapacity is lower than containerCapacity`() {
        assertThrows(IllegalArgumentException::class.java, { CerealStorage1Impl1(10f, 9.9f) })
    }

    //Добавление зерна
    @Test
    fun addCereal() = with(storage) {
        addCereal(Cereal1.RICE, 2.2f)
        assertEquals(2.2f, getAmount(Cereal1.RICE))
    }

    @Test
    fun getCerealTypes1(): Unit = with(storage) {
        assertTrue(getCerealTypes().isEmpty())
        addCereal(Cereal1.RICE, 2.2f)
        assertEquals(listOf(Cereal1.RICE), getCerealTypes())
    }

    //Добавление зерна несколько раз
    @Test
    fun addExtraCereal() = with(storage) {
        addCereal(Cereal1.RICE, 2.2f)
        addCereal(Cereal1.RICE, 1.3f)
        Assertions.assertEquals(3.5f, getAmount(Cereal1.RICE))
    }

    //Добавление разного зерна
    @Test
    fun addMultipleCereal() = with(storage) {
        addCereal(Cereal1.RICE, 1.1f)
        addCereal(Cereal1.PEAS, 2.7f)
        assertAll(
            { assertEquals(1.1f, getAmount(Cereal1.RICE)) },
            { assertEquals(2.7f, getAmount(Cereal1.PEAS)) }
        )
    }

    //Возвращает 0 если контейнер не заполнен
    @Test
    fun `should return 0 if container not full`() = with(storage) {
        assertEquals(0f, addCereal(Cereal1.BUCKWHEAT, 9.9f), 0.01f)
    }

    //Возвращает остаток, если добавленная крупа больше, чем пустое пространство контейнера
    @Test
    fun `should return rest if added cereal is biggest than container empty space`() = with(storage) {
        assertEquals(0.5f, addCereal(Cereal1.PEAS, 10.5f), 0.01f)
    }

    //Если количество крупы отрицательно
    @Test
    fun `should throw if cereal amount is negative`(): Unit = with(storage) {
        assertThrows(IllegalArgumentException::class.java) {
            addCereal(Cereal1.RICE, -1f)
        }
    }

    //нет места для нового контейнера
    @Test
    fun `should throw when storage don't have space for new container`() {
        val storage = CerealStorage1Impl1(1f, 1f)
        storage.addCereal(Cereal1.RICE, 1f)
        assertThrows(IllegalStateException::class.java) {
            storage.addCereal(Cereal1.BUCKWHEAT, 11f)
        }
    }

    //Нельзя забрать больше чем есть
    @Test
    fun getCerealToCanDispense(): Unit = with(storage) {
        addCereal(Cereal1.RICE, 1.7f)
        assertEquals(1.7f, getCereal(Cereal1.RICE, 3.7f))
    }

    //корректно работает отдача
    @Test
    fun getCereal(): Unit = with(storage) {
        addCereal(Cereal1.RICE, 6.7f)
        assertEquals(3.7f, getCereal(Cereal1.RICE, 3.7f))
    }

    //нечего выдавать когда ничего нет
    @Test
    fun `should not dispense if nothing is available`() = with(storage) {
        addCereal(Cereal1.RICE, 10.0f)
        getCereal(Cereal1.RICE, 10.0f)
        val amountDispensed = getCereal(Cereal1.RICE, 1.0f)
        assertEquals(0.0f, amountDispensed)
    }

    //Выбрасывает ошибку когда значение отрицательное
    @Test
    fun `should throw IllegalArgumentException if amount is negative`(): Unit = with(storage) {
        assertThrows(IllegalArgumentException::class.java) {
            getCereal(Cereal1.RICE, -5.0f)
        }
    }

    //Вернуть доступную сумму, если запрошено больше, чем доступно
    @Test
    fun `should return available amount if requested more than available`() = with(storage) {
        addCereal(Cereal1.RICE, 10.0f)
        val amountDispensed = getCereal(Cereal1.RICE, 15.0f)
        assertEquals(10.0f, amountDispensed)
    }

    //Вернуть доступную сумму, если запрошено больше, чем доступно, несколько круп
    @Test
    fun `should return available amount if requested more than available multiple croupes`() = with(storage) {
        addCereal(Cereal1.RICE, 10.0f)
        addCereal(Cereal1.PEAS, 1.7f)
        val amountDispensedRice = getCereal(Cereal1.RICE, 15.0f)
        val amountDispensedPeas = getCereal(Cereal1.PEAS, 3.0f)
        assertAll(
            {assertEquals(10.0f, amountDispensedRice)},
            {assertEquals(1.7f, amountDispensedPeas)}
        )
    }

    //Забор нескольких круп
    @Test
    fun `correctness of intake of several types of cereals`() = with(storage) {
        addCereal(Cereal1.RICE, 10f)
        addCereal(Cereal1.PEAS, 4f)

        getCereal(Cereal1.RICE, 5f)
        getCereal(Cereal1.PEAS, 2f)
        assertAll(
            { assertEquals(5f, getAmount(Cereal1.RICE), 0.01f) },
            { assertEquals(2f, getAmount(Cereal1.PEAS), 0.01f) }
        )
    }

    //Удаление пустого контейнера
    @Test
    fun `remove empty container`() = with(storage) {
        addCereal(Cereal1.PEAS, 14f)
        getCereal(Cereal1.PEAS, 14f)
        assertTrue(removeContainer(Cereal1.PEAS))
    }

    //Нельзя удалить если контейнер не пуст
    @Test
    fun `cannot delete a container if it is not empty`() = with(storage) {
        addCereal(Cereal1.RICE, 10f)
        assertFalse(removeContainer(Cereal1.RICE))
    }

}