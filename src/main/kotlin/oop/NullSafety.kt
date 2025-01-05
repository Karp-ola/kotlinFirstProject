package oop

/*
существуют так называемые nullable-типы. Такой тип может содержать какое-то значение, а может содержать null.
 */
fun main(){
    val nullableString: String? = null
    val notNullableString: String = "Some string"
/*
Оператор безопасного вывода ?.
Этот оператор совершает проверку значения на null слева от себя и если оно не null, то выполняет код.
Если значение null, то не происходит ничего.
И это одна из ценных фичей, потому что иначе в этом месте можно получить исключение NullPointerException.
 */
    println("nullableString $nullableString " + nullableString?.length)
    println("notNullableString $notNullableString " + notNullableString.length)

    /*
    оператор Элвис
     */
    val nullableStringLength: Int? = nullableString?.length ?: 0

    /*
    оператор утверждения "Это не null" - !!
     */
    val length = nullableString!!.length  // получим NullPointerException
}