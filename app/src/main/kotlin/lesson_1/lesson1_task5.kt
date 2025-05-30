package org.example.app.lesson_1

fun main() {
    val totalTime: Int = 6480
    val sec: Int = totalTime % 60
    val min: Int = (totalTime / 60) % 60
    val hours: Int = (totalTime / 60) / 60

    println("${String.format("%02d", hours)}:${String.format("%02d", min)}:${String.format("%02d", sec)}")
}