package com.rail.kotlincourse.lesson29.homework

import java.time.*

fun main() {
    //1

    val tekusheeVremya = ZonedDateTime.now()
    println("$tekusheeVremya")

    //2
    val dR = LocalDate.of(1994, 12, 2)

    //3
    val tekushaaData = LocalDate.now()
    val letPeriod = Period.between(dR, tekushaaData)
    println(letPeriod.years)

    //4
    val localDateTime = LocalDateTime.of(2025, 12, 2, 0, 1, 1)
    val zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("UTC"))
    val offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.UTC)
    val localDate = LocalDate.of(2027, 1, 3)
    val localTime = LocalTime.of(1, 45, 30)
    val offsetTime = OffsetTime.of(localTime, ZoneOffset.UTC)

    try {
        formatAnyDate(localDateTime)
        formatAnyDate(zonedDateTime)
        formatAnyDate(offsetDateTime)
        formatAnyDate(localDate)
        formatAnyDate(localTime)
        formatAnyDate(offsetTime)
        println("2")

        formatAnyDateByIso(localDateTime)
        formatAnyDateByIso(zonedDateTime)
        formatAnyDateByIso(offsetDateTime)
        formatAnyDateByIso(localDate)
        formatAnyDateByIso(localTime)
        formatAnyDateByIso(offsetTime)


    } catch (e: Throwable) {
        println("$e")
    }

    //5
    val localDateTime5 = LocalDateTime.of(2023, 10, 12, 10, 45, 30)
    val zonedDateTime5 = ZonedDateTime.of(localDateTime, ZoneId.of("UTC"))
    val offsetDateTime5 = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(-5))
    val localDate5 = LocalDate.of(2023, 10, 12)
    val localTime5 = LocalTime.of(10, 45, 30)
    val offsetTime5 = OffsetTime.of(localTime, ZoneOffset.ofHours(3))
    println("5")
    formatAnyDate(localDateTime5)
    formatAnyDate(zonedDateTime5)
    formatAnyDate(offsetDateTime5)
    formatAnyDate(localDate5)
    formatAnyDate(localTime5)
    formatAnyDate(offsetTime5)
}




