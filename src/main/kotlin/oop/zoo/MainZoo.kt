package oop.zoo

fun main(){
    val cat1 = Cat(1, "Vasilek", 100.00)
    println("${cat1.getType()} ${cat1.getProductName()} has age ${cat1.getAnimalAge()} and price ${cat1.getProductPrice()}")
}