package oop.person

interface Gradable {
    var grades: MutableList<Int>
    fun addGrade(grade: Int)
    fun showAllGrades()
    fun countAverage(): Double
}