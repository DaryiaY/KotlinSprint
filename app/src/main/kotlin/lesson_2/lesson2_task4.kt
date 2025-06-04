package org.example.app.lesson_2

fun main() {
    val crystallineOreStart = 7
    val ironOreStart = 11
    val buff = 20
    val allPercents = 100

    val crystallineOreBuff = crystallineOreStart * buff / allPercents
    val ironOreBuff = ironOreStart * buff / allPercents

    println("Бафф кристалической руды = $crystallineOreBuff")
    println("Бафф железной руды = $ironOreBuff")
}