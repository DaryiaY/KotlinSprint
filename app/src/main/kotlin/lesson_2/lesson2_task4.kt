package org.example.app.lesson_2

const val BUFF = 0.2
fun main() {
    val crystallineOreStart = 7
    val ironOreStart = 11

    val crystallineOreBuff = crystallineOreStart * BUFF
    val ironOreBuff = ironOreStart * BUFF

    println("Бафф кристалической руды = ${crystallineOreBuff.toInt()}")
    println("Бафф железной руды = ${ironOreBuff.toInt()}")
}