package arrays_and_lists

fun main() {
    println("Hello World!")

    val listOfCities = listOf("New York", "Rio", "Tokyo")

    listOfCities.forEach { println(it) }

    val capitals = mutableListOf("Berlin", "Bern", "Beijing")

    println("Cities with B: ${capitals.joinToString()}")
}

fun doSomethingWithArrays() {
    val letters = arrayOf("A", "B", "C", "D")
}