package org.example.app.lesson_2

fun main() {
    val student1: Double = 3.0
    val student2: Double = 4.0
    val student3: Double = 3.0
    val student4: Double = 5.0
    val countStudents: Int = 4

    val sumAndDiv: Double = (student1 + student2 + student3 + student4) / countStudents
    val averageScore: String = String.format("%.2f", sumAndDiv)

    println("Средний балл = $averageScore")
}