package com.rail.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun formatAnyDate(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        is LocalTime -> temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        is LocalDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        else -> temporal.toString()
    }.also { println(it) }
}

fun formatAnyDateByIso(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_DATE_TIME)
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        else -> temporal.toString()
    }.also { println(it) }
}