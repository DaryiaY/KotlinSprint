package org.example.app.lesson_1

fun main() {
    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"

    println("year flight = $year")
    println("hour takeoff = $hour")
    println("minute takeoff = $minute")

    hour = "10"
    minute = "55"

    println("landing = $hour:$minute")
}