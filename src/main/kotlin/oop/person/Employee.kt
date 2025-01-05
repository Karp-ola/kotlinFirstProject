package oop.person

class Employee(name: String,
               age: Int,
               var job: String,
               override var isEmployed: Boolean=true,
               override var isStudent: Boolean=false): Person(name, age), Occupation {
    override fun introduce(){
        super.introduce()
        println("Меня зовут $name и мне $age лет и я работаю $job")
    }
    override fun getOccupation(): String{
        return job
    }
}