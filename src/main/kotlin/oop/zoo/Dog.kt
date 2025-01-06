package oop.zoo

class Dog(age: Int,
          name: String,
          price: Double,
          val typeOfAnimal: String = "dog",
    )
    : AbstractAnimal(age, name, price) {

    override fun getType(): String {
        return typeOfAnimal
    }

}