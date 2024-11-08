package com.rail.kotlincourse.lesson19.homework

class GameBoy(
    var boyColor: String,
    val model: String,
    var owner: String,
    var supportPhone: String,
    private val gameList: List<String>
) {
    private var status: Boolean = false
    private var loadOS: Boolean = false
    private var gamePad: Boolean = false
    private var totalBalance: Double = 0.0

    //включить
    fun turnOn(): Boolean {
        if (!status) {
            status = true
            loadOS
        }
        return status
    }

    //выключить
    fun TurnOff(): Boolean {
        if (status) {
            status = false
            loadOS = false
        }
        return !status
    }

    //загрузить ОС
    private fun loadOs() {
        if (status) {
            loadOS = true
        }
    }

    //завешить работу ОС
    private fun loadOff() {
        if (status) {
            loadOS = false
        }
    }

    //показать список игр
    fun getGameList(): List<String> {
        return gameList
    }

    //включить игру
    fun turnOnGame(gameName: String): Boolean {
        return if (status && loadOS && gameList.contains(gameName)) {
            true
        } else {
            false
        }
    }

    //оплатить игровой сеанс
    fun payForGame(price: Double): Boolean {
        return if (price > 0) {
            totalBalance += price
            true
        } else {
            false
        }
    }

    //открыть сейф и выдать наличные
    fun takeCash(cash: Double): Boolean {
        return if (cash > totalBalance) {
            false
        } else {
            totalBalance -= cash
            true
        }
    }

    //выплатить выигрыш
    fun takeBank(bank: Double): Boolean {
        return if (totalBalance < bank) {
            false
        } else {
            totalBalance -= bank
            true
        }
    }

}
