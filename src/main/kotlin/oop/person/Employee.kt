package oop.person

class Employee(name: String, age: Int, var job: String): Person(name, age) {

    override fun introduce(){
        super.introduce()
        println("Меня зовут $name и мне $age лет и я работаю $job")
    }
}