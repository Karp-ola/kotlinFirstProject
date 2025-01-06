package oop.zoo

abstract class AbstractAnimal(age: Int, val name: String, var price: Double): Animal {
     var age: Int = age
        set(value){
            if(value>0 && value<20){
                field=value
            }else{
                throw IllegalArgumentException("Некорректный возраст")
            }
        }
     // get() = field - геттер по умолчанию, не нужно указывать явно
        get(){
            println("Возраст")
            return field
        }

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