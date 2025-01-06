package oop.zoo

abstract class AbstractAnimal(var age: Int, val name: String, var price: Double): Animal {

    override fun getAnimalAge(): Int {
        return age
    }

    override fun setAnimalAge(age: Int) {
        this.age = age
    }

    override fun getProductName(): String {
        return name
    }

    override fun setProductPrice(price: Double) {
        this.price = price
    }
    override fun getProductPrice(): Double {
        return price
    }
}