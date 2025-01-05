package oop.person

open class Person(var name: String, var age: Int) {
    open fun introduce(){
        println("Меня зовут $name и мне $age")
    }
}