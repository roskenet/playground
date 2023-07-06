fun main(args: Array<String>) {
    println("Hello World!")

    val cities = listOf("New York", "Rio", "Tokyo")

    val capitals = mutableListOf("Berlin", "Bern", "Beijing")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Capitals with B: ${capitals.joinToString()}")
}