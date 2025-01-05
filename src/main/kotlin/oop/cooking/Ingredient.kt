package oop.cooking

class Ingredient (var name: String, var weight: Int, var count: Int) {

    var isNeedToToPrepare = false
    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count){
        this.isNeedToToPrepare = isNeedToPrepare
    }

    init{
        println("Приготовление $name")
    }
}