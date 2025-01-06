package oop.zoo

interface Animal: Product {
    fun getType(): String
    fun getAnimalAge(): Int
    fun setAnimalAge(age: Int)
}