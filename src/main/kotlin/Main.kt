fun main(args: Array<String>){
    f()
//    var name: String
//    name = "Olya"
//    println("Hello, " + name)
//    println(name[2])
//    var nameLength = name.length
//    println(nameLength)
//    println("Hello, $name")
//
//    if(20 > 18){
//        println("20 is grater than 18")
//    }
}

fun f(){
    println("Введите число:")
    val t = readLine()?.toIntOrNull() ?: return
    println("Вы ввели число $t")
}