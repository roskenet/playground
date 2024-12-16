package de.felixroske

fun main() {
    // This is a range:
    val myRange = 0.rangeTo(10)

    val isInRange = checkRange(1, myRange)
    println(isInRange)
}

fun checkRange(x: Int, r: ClosedRange<Int>) =
    if (x in r) true else false
