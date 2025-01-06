package oop.zoo

class Cat(age: Int,
          name: String,
          price: Double,
          val typeOfAnimal: String = "Cat"
)
    : AbstractAnimal(age, name, price){

    override fun getType(): String {
        return typeOfAnimal
    }
}