package com.rail.kotlincourse.lesson8
fun main(){
    val origFraze = "Это невозможно выполнить за один день"
    val origFraze1 = "Я не уверен в успехе этого проекта"
    val origFraze2 = "Произошла катастрофа на сервере"
    val origFraze3 = "Этот код работает без проблем"
    val origFraze4 = "Удача"
    println(fraze(origFraze))
    println(fraze1(origFraze1))
}
fun fraze(origFraze:String):String{
    //Если фраза содержит слово "невозможно":
    //Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
    return when {
        origFraze.contains("невозможно") -> origFraze.replace("невозможно", "совершенно точно возможно, просто требует времени", true )
        else -> ""
    }
}

fun fraze1(origFraze1: String):String {
    return when {
        origFraze1.startsWith("Я не уверен", true) -> "$origFraze1, но моя интуиция говорит об обратном"
        else -> ""
    }
}




