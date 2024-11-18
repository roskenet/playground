package de.felixroske


fun main() {

    val cities = mutableListOf<String>("Paris", "Berlin", "Brussels", "Vienna", "Berlin")

    val mapIndexed = cities.toSet().sorted().mapIndexed { i, s -> println("$i: $s") }

}