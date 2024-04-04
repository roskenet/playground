package org.example

// kata_001: 100001st prime number:
fun main() {
    println("Calculating the 10001 Prime Number")
    var numsFound: UInt = 6u;

    var counter: Long = 13;

    while(numsFound < 10001u) {
        if (isPrime(++counter)) {
            ++numsFound
        }
    }

    println("The 10001st Prime Number is: ${counter}")
}

fun isPrime(number: Long): Boolean {

    for (x: Long in 2..number) {

    }
}