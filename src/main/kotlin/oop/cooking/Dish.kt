package oop.cooking

class Dish(
    val id: Int,
    val name: String,
    val category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
){
    fun addToFavorites(){
        inFavorites=true
        println("Блюдо $name добавленно в избранное")
    }

    fun removeFromFavorites(){
        inFavorites=false
        println("Блюдо $name убранно из избранного")
    }

    fun startCooking(){
        println("Пользователь начал приготовление блюда $name")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }
}