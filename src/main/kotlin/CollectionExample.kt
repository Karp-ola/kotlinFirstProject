fun main() {
    // List представляет неизменяемую (immutable) коллекцию,
    // которая в основном только обеспечивает получение элементов по позиции
    var numbers = listOf(1, 2, 3, 3, 6, 5, 7)
    for (num in numbers) println(num) // перебор элементов
    println(numbers)
    println("Получить элемент используя get: ${numbers.get(0)}")
    println("Получить элемент используя []: ${numbers[0]}")
    println("Получить элемент используя getOrNull: ${numbers.getOrNull(10)}") // если выходим за границы - вернется null
    println("Получить элемент используя getOrElse: ${numbers.getOrElse(10) { "Undefined" }}")

    val sublist = numbers.subList(3, 6)
    println("sublist: $sublist")


    var list: List<Int> = listOf(1, 2, 3, 4, 5, 6)

    /// ИЗМЕНЯЕМЫЕ СПИСКИ \\\
    var fruits: MutableList<String> = mutableListOf<String>("apple", "grapes", "banana", "cherry")
    var mutableList2: ArrayList<String> = arrayListOf("один", "два", "один");

    fruits.add("orange")
    for (fruit in fruits) println(fruit)


    //Set

    var people = setOf("Alice", "Bob", "Nick", "Alex")

    var transformedToSet = mutableList2.toSet();
    println(transformedToSet)

    var employees = setOf("Bob", "Karl", "Nick", "Gleb")

    var unionOfPeople = people.union(employees) //объединяет множества
    println(unionOfPeople)

    var intersectOfPeople = people.intersect(employees) //возвращает совпадения
    println(intersectOfPeople)

    var subtractOfPeople =
        people.subtract(employees) //вычитает множества (возвращает элементы первого множества, которых нет во втором)
    println(subtractOfPeople)


    /// ИЗМЕНЯЕМЫЕ МНОЖЕСТВА \\\
    var set1: MutableSet<String> = mutableSetOf("один", "два", "три")
    //Интерфейс MutableSet реализуется типами HashSet, LinkedHashSet
    var hashedSetOfTrees: HashSet<String> = hashSetOf("елка", "дуб", "ясень", "береза")
    var linkedHashSetOfGoods: LinkedHashSet<String> = linkedSetOf("TV", "computer", "Phone")

    linkedHashSetOfGoods.addAll(listOf("Headphones", "Microphone"))

    for(goods in linkedHashSetOfGoods) println("Goods: $goods")


    // Map

    var mapOfPeople = mapOf(1 to "Tom", 4 to "Bob", 7 to "Chloe")
    for(person in mapOfPeople) println("ключ ${person.key} значения ${person.value}")
    println(mapOfPeople.get(4))
    println(mapOfPeople.getOrDefault(8, "Undefined"))
    println(mapOfPeople.getOrElse(9){"Not Found"})

    println(mapOfPeople.containsValue("Bob"))

        /// НЕИЗМЕНЯЕМАЯ КАРТА \\\
    var mapOfColours: MutableMap<String, String> = mutableMapOf("red" to "красный", "blue" to "синий", "white" to "белый")
    // интерфейс MutableMap реализуется коллекциями HashMap, LinkedHashMap
    var map1: HashMap<Int, String> = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    var map2: LinkedHashMap<Int, String> = linkedMapOf(3 to "three", 10 to "ten", 7 to "seven")
    map1.put(4, "four")

}