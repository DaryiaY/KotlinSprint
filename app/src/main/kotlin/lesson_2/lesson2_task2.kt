package org.example.app.lesson_2

fun main() {
    val employees: Int = 50
    val intern: Int = 30
    val employeesSalary: Int = 30000
    val internSalary: Int = 20000

    val salaryExpensesEmployees: Int = employees * employeesSalary
    println("Расходы на ЗП постоянных сотрудников = $salaryExpensesEmployees")

    val salaryExpensesIntern: Int = intern * internSalary
    val totalExpenses: Int = salaryExpensesEmployees + salaryExpensesIntern
    println("Общие расходы по ЗП = $totalExpenses")

    val averageSalary: Int = totalExpenses / (employees + intern)
    println("Средняя ЗП одного сотрудника = $averageSalary")
}