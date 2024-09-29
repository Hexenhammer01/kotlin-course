package com.rail.kotlincourse.lesson8
fun main1(){
    val origFraze = "Это невозможно выполнить за один день"
    val origFraze1 = "Я не уверен в успехе этого проекта"
    val origFraze2 = "Произошла катастрофа на сервере"
    val origFraze3 = "Этот код работает без проблем"
    val origFraze4 = "Удача"
    println(fraze(origFraze))
    println(fraze1(origFraze1))
    println(fraze2(origFraze2))
    println(fraze3(origFraze3))
    println(fraze4(origFraze4))


}
fun fraze(origFraze:String):String{
    //Если фраза содержит слово "невозможно":
    //Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
    return when {
        origFraze.contains("невозможно") -> origFraze.replace("невозможно", "совершенно точно возможно, просто требует времени", true )
        else -> " "
    }
}

fun fraze1(origFraze1:String):String {
    return when {
        origFraze1.startsWith("Я не уверен", true) -> "$origFraze1, но моя интуиция говорит об обратном"
        else -> " "
    }
}
fun fraze2(origFraze2:String): String{
    return when {
        origFraze2.contains("катастрофа", true) -> origFraze2.replace("катастрофа", "интересное событие")
        else -> " "
    }
}
fun fraze3(origFraze3:String):String{
    return when {
        origFraze3.endsWith("без проблем", true ) -> origFraze3.replace("без проблем","с парой интересных вызовов на пути")
        else-> " "
    }
}
fun fraze4(origFraze4:String):String{
    return when{
        origFraze4.contains("Иногда",true) -> "Иногда ${origFraze4.lowercase()}, но не всегда"
        else -> " "
    }
}
fun main(){
    val i = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val i1 = "Пользователь вошел в систему -> 2021-12-01 09:48:23".indexOf(">")
//    println(i1)
    println(i.substring(i1+2,i1+12))
    println(i.substring(i1+13,i1+21))
}


