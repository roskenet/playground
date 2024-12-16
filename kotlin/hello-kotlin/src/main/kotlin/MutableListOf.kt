package de.felixroske

fun main() {

    val cities = mutableListOf("Paris", "Berlin", "Brussels", "Vienna", "Berlin")

    val mapIndexed = cities.toSet().sorted().mapIndexed { i, s -> println("$i: $s") }
    mapIndexed.forEach(::println)

}