package oop.zoo

class Dog(age: Int,
          name: String,
          price: Double,
          val typeOfAnimal: String = "Dog",
    )
    : AbstractAnimal(age, name, price) {

    val fullInfo: String
            get() {
                return "$name $age"
            }
    override fun getType(): String {
        return typeOfAnimal
    }

}