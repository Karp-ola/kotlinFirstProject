package oop.person

fun main() {
    var student1 = Student("Oleg", 22, "Кембридж")
    println(student1.introduce())

    var employee1 = Employee("Vlad", 48, "Google")
    println(employee1.introduce())

    var person1 = Person("Ola", 31)
    println(person1.introduce())

    var occupationOfEmployee1 = employee1.getOccupation()
    println(occupationOfEmployee1)

    student1.addGrade(8)
    student1.addGrade(9)
    student1.showAllGrades()

    var occupationOfStudent1 = student1.getOccupation()
    println(occupationOfStudent1)
    student1.addGrade(7)
    student1.addGrade(8)
    var averageGrade = student1.countAverage()
    println(averageGrade)

}
