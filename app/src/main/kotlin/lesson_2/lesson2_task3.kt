package org.example.app.lesson_2

const val COUNT_MIN_IN_HOUR = 60
fun main() {
    val timeStart: String = "9:39"
    val travelTimeMin: Int = 457

    val positon = timeStart.indexOf(":")
    val timeStartHour = timeStart.substring(0, positon).toInt()
    val timeStartMin = timeStart.substring(positon + 1, timeStart.length).toInt()

    val allMin = timeStartHour * COUNT_MIN_IN_HOUR + timeStartMin + travelTimeMin

    val arrivalHour = allMin / COUNT_MIN_IN_HOUR
    val arrivalMin = allMin % COUNT_MIN_IN_HOUR

    println("Время прибытия поезда %02d:%02d".format(arrivalHour, arrivalMin))
}