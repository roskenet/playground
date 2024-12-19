package de.felixroske

import kotlinx.coroutines.*

suspend fun main() {
    myFirstCoroutine()
}

suspend fun myFirstCoroutine() = coroutineScope {
    launch {
       delay(1000)
       println("Kotlin Coroutines World!")
    }
    println("Hello")
}