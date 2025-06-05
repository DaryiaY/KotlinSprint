package org.example.app.lesson_3

fun main() {
    val userName: String = "Дария"

    var greeting: String = "${userName}, добрый день!"
    println(greeting)

    greeting = "${userName}, добрый вечер!"
    println(greeting)
}