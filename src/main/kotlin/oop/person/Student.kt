package oop.person

class Student(
    name: String,
    age: Int,
    var school: String,
    override var isEmployed: Boolean = false,
    override var isStudent: Boolean = true
    )
    : Person(name, age), Occupation, Gradable{

    override var grades = mutableListOf<Int>()
    override fun introduce(){
        println("Меня зовут $name, мне $age лет и я учусь в $school школе")
    }

    override fun addGrade(grade: Int){
        grades.add(grade)
        println("Оценка $grade добавленна")
    }

    override fun showAllGrades(){
        if(grades.isNotEmpty()){
            println("Оценки $name: ${grades.joinToString(", ")}")
        } else{
            println("Оценок нет")
        }
    }
    override fun getOccupation(): String{
        return school
    }
    override fun countAverage(): Double{
        return grades.asSequence().map{it.toDouble()}.average()
    }
}