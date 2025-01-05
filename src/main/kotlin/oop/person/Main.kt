package oop.person

fun main(){
    var student1 = Student("Oleg", 22, "Кембридж")
    println(student1.introduce())

    var employee1 = Employee("Vlad", 48, "Google")
    println(employee1.introduce())

    var person1 = Person("Ola", 31)
    println(person1.introduce())

    student1.addGrade(8)
    student1.addGrade(9)
    student1.showAllGrades()
}