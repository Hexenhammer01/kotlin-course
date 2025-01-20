package com.rail.kotlincourse.lesson31.homework

interface CerealStorage1 {

    /**
     * Объём одного контейнера
     * @throws IllegalArgumentException если значение отрицательное при инициализации
     */
    val containerCapacity: Float

    /**
     * Совокупный объём хранилища
     * @throws IllegalArgumentException если значение меньше, чем [containerCapacity] при инициализации
     */
    val storageCapacity: Float

    /**
     * Добавляет крупу к существующему контейнеру соответствующего
     * типа, либо добавляет новый контейнер
     * если его ещё не было в хранилище и добавляет в него
     * предоставленную крупу.
     * @param cereal1 крупа для добавления в контейнер
     * @param amount количество добавляемой крупы
     * @return количество оставшейся крупы если контейнер заполнился
     * @throws IllegalArgumentException если передано отрицательное значение
     * @throws IllegalStateException если хранилище не позволяет разместить ещё один контейнер для новой крупы
     */
    fun addCereal(cereal1: Cereal1, amount: Float): Float

    /**
     * @param cereal1 крупа, которую нужно взять из контейнера
     * @param amount количество крупы
     * @return количество полученной крупы или остаток, если было меньше
     * @throws IllegalArgumentException если передано отрицательное значение
     */
    fun getCereal(cereal1: Cereal1, amount: Float): Float

    /**
     * @param cereal1 уничтожает пустой контейнер
     * @return true если контейнер уничтожен и false если контейнер не пуст
     */
    fun removeContainer(cereal1: Cereal1): Boolean

    /**
     * @param cereal1 крупа, количество которой нужно узнать
     * @return количество крупы, которое хранится в контейнере
     */
    fun getAmount(cereal1: Cereal1): Float

    /**
     * @param cereal1 крупа, для которой нужно проверить доступное место в контейнере
     * @return количество крупы, которое может вместить контейнер с учётом его текущей заполненности
     */
    fun getSpace(cereal1: Cereal1): Float

    /**
     * @return текстовое представление
     */
    override fun toString(): String
}