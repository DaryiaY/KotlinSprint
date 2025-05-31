package org.example.app.lesson_1

const val COUNT_SEC_IN_MIN = 60
const val COUNT_MIN_IN_HOUR = 60
fun main() {
    val totalTime: Int = 6480
    val sec: Int = totalTime % COUNT_SEC_IN_MIN
    val min: Int = (totalTime / COUNT_SEC_IN_MIN) % COUNT_SEC_IN_MIN
    val hours: Int = (totalTime / COUNT_SEC_IN_MIN) / COUNT_MIN_IN_HOUR

    println("%02d:%02d:%02d".format(hours, min, sec))
}