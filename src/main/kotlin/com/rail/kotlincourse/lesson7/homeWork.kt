package com.rail.kotlincourse.lesson7

fun main(){
    for(i in 1..5){
        println(i)
    }
}

fun main(){
    for(i in 1..10){
        if (i%2==0)
            println(i)
    }
}

fun main(){
    for (i in 5 downTo 1){
        println(i)
    }
}
fun main(){
    for (i in 10 downTo 1){
        println(i-2)
    }
}

fun main(){
    for (i in 1..9 step 2){
        println(i)
    }
}
fun main(){
    for (i in 1..20 step 3){
        println(i)
    }
}
fun main(){
    for (i in 1 until 9){
        println(i)
    }
}
fun main(){
    for (i in 3 until 15){
        println(i)
    }
}
fun main(){
    var q = 1
    while(q<=5){
        q += 1
        println(q*q)
    }
}
fun main(){
    var q = 10
    while(q > 5){
        q -= 1
        println(q)
    }
}
fun main() {
    var q = 5
    do {
        println(q)
        q -= 1
    } while (q > 0)
}
fun main() {
    var q = 5
    do {
        println(q)
        q += 1
    } while (q < 10)
}
fun main() {
    for (i in 1..10){
        if (i==6)break
        println(i)
    }
}
fun main() {
    var q = 1
    while (q < 10) {
        if (q % 2 == 0){
            q +=1;continue
        }
        println(q)
        q +=1
    }
}
fun main() {
    var q = 1
    while (q < 10) {
        if (q % 3 == 0){
            q +=1;continue
        }
        println(q)
        q +=1
    }
}
fun main() {
    for (i in 1..10) {
        for (q in 1..10) {
            print(i*q)
            print(" ")
        }
        println()
    }
}