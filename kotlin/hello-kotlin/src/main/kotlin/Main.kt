fun main(args: Array<String>) {
    println("Hello World!")

    val cities = listOf("New York", "Rio", "Tokyo")

    val capitals = mutableListOf("Berlin", "Bern", "Beijing")

    println("Capitals with B: ${capitals.joinToString()}")
}

val capitalsWithB = mutableListOf("Berlin", "Kairo", "Washington")
fun doSomethingElse() {
    println("Hello World")
}