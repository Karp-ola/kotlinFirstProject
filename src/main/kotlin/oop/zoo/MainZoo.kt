package oop.zoo

fun main(){
    val cat1 = Cat(1, "Vasilek", 100.00)
    println("${cat1.getType()} ${cat1.getProductName()} has age ${cat1.getAnimalAge()} and price ${cat1.getProductPrice()}")
    cat1.age = 14
    println(cat1.age)
 // cat1.age = 21  получим исключение
    println(cat1.age)

    var dog2 = Dog(2, "Bobik", 213.22)
    println("${dog2.fullInfo}")
}