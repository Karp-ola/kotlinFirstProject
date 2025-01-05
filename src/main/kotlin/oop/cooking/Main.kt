package oop.cooking

import oop.cooking.Dish
import oop.cooking.Ingredient

fun main(){
    val dish1: Dish = Dish(
        1,
        "egg",
        "breakfast",
        listOf("egg", "milk"),
    )

    val dish2: Dish = Dish(
        2,
        "pankakes",
        "breakfast",
        listOf("milk", "tomato"),
        true,
    )

    val ingredients = dish1.ingredients
    println(ingredients)
    dish1.addToFavorites()
    println(dish1.inFavorites)

    // создадим объект Ingredient
    val ingredient1 = Ingredient("Картошка", 1000, 10)
    println(ingredient1.name)


    val ingredient2 = Ingredient("Марковь", 500, 20, true)
    println(ingredient2.isNeedToToPrepare)


}