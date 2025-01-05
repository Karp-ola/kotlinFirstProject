package oop.person

class Student(
    name: String,
    age: Int,
    var school: String,
    ): Person(name, age) {

    val grades = mutableListOf<Int>();
    override fun introduce(){
        println("Меня зовут $name, мне $age лет и я учусь в $school школе")
    }

    fun addGrade(grade: Int){
        grades.add(grade)
        println("Оценка $grade добавленна")
    }

    fun showAllGrades(){
        if(grades.isNotEmpty()){
            println("Оценки $name: ${grades.joinToString(", ")}")
        } else{
            println("Оценок нет")
        }
    }
}