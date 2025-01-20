package com.rail.kotlincourse.lesson31.homework

import kotlin.math.min

// Пример имплементации интерфейса с блоком инициализации класса

class CerealStorage1Impl1(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage1 {
    // Блок инициализации класса. Выполняется сразу при создании объекта
    init {
        require(containerCapacity >= 0) {
            "Ёмкость контейнера не может быть отрицательной"
        }
        require(storageCapacity >= containerCapacity) {
            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
        }
    }

    private val storage = mutableMapOf<Cereal1, Float>()

    fun getCerealTypes() = storage.keys.toList()

    override fun addCereal(cereal1: Cereal1, amount: Float): Float {
        require(amount >= 0) {
            "Количество крупы не может быть отрицательным"
        }
        checkStorageCapacity(cereal1)
        val currentAmount = storage.getOrDefault(cereal1, 0f)
        val amountForAdding = min(getSpace(cereal1), amount)
        storage[cereal1] = currentAmount + amountForAdding
        return amount - amountForAdding
    }

    override fun getCereal(cereal1: Cereal1, amount: Float): Float {
        require(amount >= 0) {
            "Количество крупы не может быть отрицательным"
        }
        val currentAmount = storage.getOrDefault(cereal1, 0f)
        val amountToDispense = min(currentAmount, amount)
        storage[cereal1] = currentAmount - amountToDispense
        return amountToDispense


    }

    override fun removeContainer(cereal1: Cereal1): Boolean {
        val currentAmount = storage.getOrDefault(cereal1, 0f)
        return if (currentAmount != 0f) {
            false
        } else {
            storage.remove(cereal1)
            true
        }
    }

    override fun getAmount(cereal1: Cereal1): Float {
        return storage.getOrDefault(cereal1, 0f)
    }

    override fun getSpace(cereal1: Cereal1): Float {
        return containerCapacity - getAmount(cereal1)
    }

    override fun toString(): String {
        return storage.entries.joinToString { "${it.key.local}: ${it.value}" }
    }

    private fun checkStorageCapacity(cereal1: Cereal1) {
        if (storage.contains(cereal1)) return
        check(storageCapacity >= (storage.size + 1) * containerCapacity) {
            "Недостаточно места в хранилище для нового контейнера"
        }
    }
}
